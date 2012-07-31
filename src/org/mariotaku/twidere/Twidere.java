package org.mariotaku.twidere;

import org.mariotaku.twidere.model.ComposingStatus;
import org.mariotaku.twidere.model.ParcelableStatus;
import org.mariotaku.twidere.model.ParcelableUser;
import org.mariotaku.twidere.model.ParcelableUserList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public final class Twidere implements Constants {

	public static void appendComposeActivityText(Activity activity, String text) {
		if (activity == null) return;
		final Intent intent = new Intent();
		final Bundle extras = new Bundle();
		extras.putString(INTENT_KEY_APPEND_TEXT, text);
		intent.putExtras(extras);
		activity.setResult(Activity.RESULT_OK, intent);
		activity.finish();
	}

	public static ComposingStatus getComposingStatusFromIntent(Intent intent) {
		if (intent == null) return null;
		return new ComposingStatus(intent);
	}

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

	public static void replaceComposeActivityText(Activity activity, String text) {
		if (activity == null) return;
		final Intent intent = new Intent();
		final Bundle extras = new Bundle();
		extras.putString(INTENT_KEY_TEXT, text);
		intent.putExtras(extras);
		activity.setResult(Activity.RESULT_OK, intent);
		activity.finish();
	}
}
