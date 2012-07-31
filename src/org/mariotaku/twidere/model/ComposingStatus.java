package org.mariotaku.twidere.model;

import org.mariotaku.twidere.Constants;

import android.content.Intent;
import android.os.Bundle;

public class ComposingStatus implements Constants {

	public final String text, user_name, in_reply_to_screen_name, in_reply_to_name;
	public final long in_reply_to_id;

	public ComposingStatus(Intent intent) {
		final Bundle extras = intent != null ? intent.getExtras() : null;
		text = extras != null ? extras.getString(INTENT_KEY_TEXT) : null;
		user_name = extras != null ? extras.getString(INTENT_KEY_SCREEN_NAME) : null;
		in_reply_to_screen_name = extras != null ? extras.getString(INTENT_KEY_IN_REPLY_TO_SCREEN_NAME) : null;
		in_reply_to_name = extras != null ? extras.getString(INTENT_KEY_IN_REPLY_TO_NAME) : null;
		in_reply_to_id = extras != null ? extras.getLong(INTENT_KEY_IN_REPLY_TO_ID, -1) : -1;
	}
}
