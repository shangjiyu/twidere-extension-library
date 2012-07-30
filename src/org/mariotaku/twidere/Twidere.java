package org.mariotaku.twidere;

import org.mariotaku.twidere.model.ParcelableStatus;
import org.mariotaku.twidere.model.ParcelableUser;
import org.mariotaku.twidere.model.ParcelableUserList;

import android.content.Intent;
import android.os.Bundle;

public final class Twidere implements Constants {

	public static ParcelableStatus getStatusFromIntent(Intent intent) {
		if (intent == null) return null;
		final Bundle extras = intent.getExtras();
		if (extras == null) return null;
		return extras.getParcelable(INTENT_KEY_STATUS);
	}
	
	public static ParcelableUser getUserFromIntent(Intent intent) {
		if (intent == null) return null;
		final Bundle extras = intent.getExtras();
		if (extras == null) return null;
		return extras.getParcelable(INTENT_KEY_USER);
	}
	
	public static ParcelableUserList getUserListFromIntent(Intent intent) {
		if (intent == null) return null;
		final Bundle extras = intent.getExtras();
		if (extras == null) return null;
		return extras.getParcelable(INTENT_KEY_USER_LIST);
	}
}
