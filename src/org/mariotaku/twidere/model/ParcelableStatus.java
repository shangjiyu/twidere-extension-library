/*
 *				Twidere - Twitter client for Android
 * 
 * Copyright (C) 2012 Mariotaku Lee <mariotaku.lee@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.mariotaku.twidere.model;

import static org.mariotaku.twidere.util.HtmlUnescapeHelper.unescapeHTML;
import static org.mariotaku.twidere.util.Utils.parseURL;

import java.net.URL;
import java.util.Comparator;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.Spanned;

public class ParcelableStatus implements Parcelable {

	public static final Parcelable.Creator<ParcelableStatus> CREATOR = new Parcelable.Creator<ParcelableStatus>() {
		@Override
		public ParcelableStatus createFromParcel(Parcel in) {
			return new ParcelableStatus(in);
		}

		@Override
		public ParcelableStatus[] newArray(int size) {
			return new ParcelableStatus[size];
		}
	};

	public final long retweet_id, retweeted_by_id, status_id, account_id, user_id, status_timestamp, retweet_count,
			in_reply_to_status_id;

	public final boolean is_gap, is_retweet, is_favorite, is_protected, is_verified, has_media;

	public final String retweeted_by_name, retweeted_by_screen_name, text_html, text_plain, name, screen_name,
			in_reply_to_screen_name, source, profile_image_url_string, image_preview_url_string, location_string;
	public final ParcelableLocation location;

	public final Spanned text;

	public final URL profile_image_url, image_preview_url;

	public static final Comparator<ParcelableStatus> TIMESTAMP_COMPARATOR = new Comparator<ParcelableStatus>() {

		@Override
		public int compare(ParcelableStatus object1, ParcelableStatus object2) {
			final long diff = object2.status_timestamp - object1.status_timestamp;
			if (diff > Integer.MAX_VALUE) return Integer.MAX_VALUE;
			if (diff < Integer.MIN_VALUE) return Integer.MIN_VALUE;
			return (int) diff;
		}
	};

	public static final Comparator<ParcelableStatus> STATUS_ID_COMPARATOR = new Comparator<ParcelableStatus>() {

		@Override
		public int compare(ParcelableStatus object1, ParcelableStatus object2) {
			final long diff = object2.status_id - object1.status_id;
			if (diff > Integer.MAX_VALUE) return Integer.MAX_VALUE;
			if (diff < Integer.MIN_VALUE) return Integer.MIN_VALUE;
			return (int) diff;
		}
	};

	public ParcelableStatus(Parcel in) {
		retweet_id = in.readLong();
		retweeted_by_id = in.readLong();
		status_id = in.readLong();
		account_id = in.readLong();
		user_id = in.readLong();
		status_timestamp = in.readLong();
		retweet_count = in.readLong();
		in_reply_to_status_id = in.readLong();
		is_gap = in.readInt() == 1;
		is_retweet = in.readInt() == 1;
		is_favorite = in.readInt() == 1;
		is_protected = in.readInt() == 1;
		is_verified = in.readInt() == 1;
		has_media = in.readInt() == 1;
		retweeted_by_name = in.readString();
		retweeted_by_screen_name = in.readString();
		text_html = in.readString();
		text_plain = in.readString();
		name = in.readString();
		screen_name = in.readString();
		in_reply_to_screen_name = in.readString();
		source = in.readString();
		profile_image_url_string = in.readString();
		image_preview_url_string = in.readString();
		location_string = in.readString();
		location = new ParcelableLocation(location_string);
		image_preview_url = parseURL(image_preview_url_string);
		profile_image_url = parseURL(profile_image_url_string);
		text = text_html != null ? Html.fromHtml(text_html) : null;

	}

	@Override
	public int describeContents() {
		return hashCode();
	}

	@Override
	public String toString() {
		return unescapeHTML(text_html);
	}

	@Override
	public void writeToParcel(Parcel out, int flags) {
		out.writeLong(retweet_id);
		out.writeLong(retweeted_by_id);
		out.writeLong(status_id);
		out.writeLong(account_id);
		out.writeLong(user_id);
		out.writeLong(status_timestamp);
		out.writeLong(retweet_count);
		out.writeLong(in_reply_to_status_id);
		out.writeInt(is_gap ? 1 : 0);
		out.writeInt(is_retweet ? 1 : 0);
		out.writeInt(is_favorite ? 1 : 0);
		out.writeInt(is_protected ? 1 : 0);
		out.writeInt(is_verified ? 1 : 0);
		out.writeInt(has_media ? 1 : 0);
		out.writeString(retweeted_by_name);
		out.writeString(retweeted_by_screen_name);
		out.writeString(text_html);
		out.writeString(text_plain);
		out.writeString(name);
		out.writeString(screen_name);
		out.writeString(in_reply_to_screen_name);
		out.writeString(source);
		out.writeString(profile_image_url_string);
		out.writeString(image_preview_url_string);
		out.writeString(location_string);
	}
}
