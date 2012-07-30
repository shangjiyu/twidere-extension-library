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

package org.mariotaku.twidere;

import org.mariotaku.twidere.provider.TweetStore.Accounts;
import org.mariotaku.twidere.provider.TweetStore.CachedTrends;
import org.mariotaku.twidere.provider.TweetStore.CachedUsers;
import org.mariotaku.twidere.provider.TweetStore.DirectMessages;
import org.mariotaku.twidere.provider.TweetStore.Drafts;
import org.mariotaku.twidere.provider.TweetStore.Filters;
import org.mariotaku.twidere.provider.TweetStore.Mentions;
import org.mariotaku.twidere.provider.TweetStore.Statuses;

public interface Constants {

	public static final String SCHEME_HTTP = "http";
	public static final String SCHEME_HTTPS = "https";
	public static final String SCHEME_CONTENT = "content";
	public static final String SCHEME_TWIDERE = "twidere";

	public static final String PROTOCOL_HTTP = SCHEME_HTTP + "://";
	public static final String PROTOCOL_HTTPS = SCHEME_HTTPS + "://";
	public static final String PROTOCOL_CONTENT = SCHEME_CONTENT + "://";
	public static final String PROTOCOL_TWIDERE = SCHEME_TWIDERE + "://";

	public static final String AUTHORITY_USER = "user";
	public static final String AUTHORITY_USER_TIMELINE = "user_timeline";
	public static final String AUTHORITY_USER_FAVORITES = "user_favorites";
	public static final String AUTHORITY_USER_FOLLOWERS = "user_followers";
	public static final String AUTHORITY_USER_FRIENDS = "user_friends";
	public static final String AUTHORITY_USER_BLOCKS = "user_blocks";
	public static final String AUTHORITY_STATUS = "status";
	public static final String AUTHORITY_CONVERSATION = "conversation";
	public static final String AUTHORITY_DIRECT_MESSAGES_CONVERSATION = "direct_messages_conversation";
	public static final String AUTHORITY_SEARCH = "search";
	public static final String AUTHORITY_MAP = "map";
	public static final String AUTHORITY_LIST_DETAILS = "list_details";
	public static final String AUTHORITY_LIST_TYPES = "list_types";
	public static final String AUTHORITY_LIST_TIMELINE = "list_timeline";
	public static final String AUTHORITY_LIST_MEMBERS = "list_members";
	public static final String AUTHORITY_LIST_SUBSCRIBERS = "list_subscribers";
	public static final String AUTHORITY_LIST_CREATED = "list_created";
	public static final String AUTHORITY_LIST_SUBSCRIPTIONS = "list_subscriptions";
	public static final String AUTHORITY_LIST_MEMBERSHIPS = "list_memberships";

	public static final String QUERY_PARAM_ACCOUNT_ID = "account_id";
	public static final String QUERY_PARAM_ACCOUNT_NAME = "account_name";
	public static final String QUERY_PARAM_STATUS_ID = "status_id";
	public static final String QUERY_PARAM_USER_ID = "user_id";
	public static final String QUERY_PARAM_LIST_ID = "list_id";
	public static final String QUERY_PARAM_SCREEN_NAME = "screen_name";
	public static final String QUERY_PARAM_LIST_NAME = "list_name";
	public static final String QUERY_PARAM_QUERY = "query";
	public static final String QUERY_PARAM_TYPE = "type";
	public static final String QUERY_PARAM_VALUE_USERS = "users";
	public static final String QUERY_PARAM_VALUE_TWEETS = "tweets";
	public static final String QUERY_PARAM_NOTIFY = "notify";
	public static final String QUERY_PARAM_LAT = "lat";
	public static final String QUERY_PARAM_LNG = "lng";
	public static final String QUERY_PARAM_CONVERSATION_ID = "conversation_id";

	public static final String DEFAULT_PROTOCOL = PROTOCOL_HTTPS;

	public static final String DEFAULT_OAUTH_CALLBACK = PROTOCOL_TWIDERE + "com.twitter.oauth/";

	public static final String SHUFFIX_SCROLL_TO_TOP = ".SCROLL_TO_TOP";

	public static final String OAUTH_VERIFIER = "oauth_verifier";

	public static final String SHARED_PREFERENCES_NAME = "preferences";

	public static final String PREFERENCE_KEY_DATABASE_ITEM_LIMIT = "database_item_limit";
	public static final String PREFERENCE_KEY_LOAD_ITEM_LIMIT = "load_item_limit";
	public static final String PREFERENCE_KEY_TEXT_SIZE = "text_size";
	public static final String PREFERENCE_KEY_DARK_THEME = "dark_theme";
	public static final String PREFERENCE_KEY_SOLID_COLOR_BACKGROUND = "solid_color_background";
	public static final String PREFERENCE_KEY_CLEAR_DATABASES = "clear_databases";
	public static final String PREFERENCE_KEY_CLEAR_CACHE = "clear_cache";
	public static final String PREFERENCE_KEY_DISPLAY_PROFILE_IMAGE = "display_profile_image";
	public static final String PREFERENCE_KEY_INLINE_IMAGE_PREVIEW = "inline_image_preview";
	public static final String PREFERENCE_KEY_DISPLAY_NAME = "display_name";
	public static final String PREFERENCE_KEY_COMPOSE_BUTTON = "bottom_compose_button";
	public static final String PREFERENCE_KEY_LEFTSIDE_COMPOSE_BUTTON = "leftside_compose_button";
	public static final String PREFERENCE_KEY_ATTACH_LOCATION = "attach_location";
	public static final String PREFERENCE_KEY_ENABLE_FILTER = "enable_filter";
	public static final String PREFERENCE_KEY_GZIP_COMPRESSING = "gzip_compressing";
	public static final String PREFERENCE_KEY_IGNORE_SSL_ERROR = "ignore_ssl_error";
	public static final String PREFERENCE_KEY_LOAD_MORE_AUTOMATICALLY = "load_more_automatically";
	public static final String PREFERENCE_KEY_CONSUMER_KEY = "consumer_key";
	public static final String PREFERENCE_KEY_CONSUMER_SECRET = "consumer_secret";
	public static final String PREFERENCE_KEY_QUOTE_FORMAT = "quote_format";
	public static final String PREFERENCE_KEY_DEFAULT_ACCOUNT_ID = "default_account_id";
	public static final String PREFERENCE_KEY_REMEMBER_POSITION = "remember_position";
	public static final String PREFERENCE_KEY_SAVED_HOME_TIMELINE_ID = "saved_home_timeline_id";
	public static final String PREFERENCE_KEY_SAVED_MENTIONS_LIST_ID = "saved_mentions_list_id";
	public static final String PREFERENCE_KEY_SAVED_TAB_POSITION = "saved_tab_position";
	public static final String PREFERENCE_KEY_ENABLE_PROXY = "enable_proxy";
	public static final String PREFERENCE_KEY_PROXY_HOST = "proxy_host";
	public static final String PREFERENCE_KEY_PROXY_PORT = "proxy_port";
	public static final String PREFERENCE_KEY_STOP_SERVICE_AFTER_CLOSED = "stop_service_after_closed";
	public static final String PREFERENCE_KEY_SORT_TIMELINE_BY_TIME = "sort_timeline_by_time";
	public static final String PREFERENCE_KEY_REFRESH_ON_START = "refresh_on_start";
	public static final String PREFERENCE_KEY_REFRESH_AFTER_TWEET = "refresh_after_tweet";
	public static final String PREFERENCE_KEY_AUTO_REFRESH = "auto_refresh";
	public static final String PREFERENCE_KEY_REFRESH_INTERVAL = "refresh_interval";
	public static final String PREFERENCE_KEY_REFRESH_ENABLE_HOME_TIMELINE = "refresh_enable_home_timeline";
	public static final String PREFERENCE_KEY_REFRESH_ENABLE_MENTIONS = "refresh_enable_mentions";
	public static final String PREFERENCE_KEY_REFRESH_ENABLE_DIRECT_MESSAGES = "refresh_enable_direct_messages";
	public static final String PREFERENCE_KEY_NOTIFICATION_ENABLE_HOME_TIMELINE = "notification_enable_home_timeline";
	public static final String PREFERENCE_KEY_NOTIFICATION_ENABLE_MENTIONS = "notification_enable_mentions";
	public static final String PREFERENCE_KEY_NOTIFICATION_ENABLE_DIRECT_MESSAGES = "notification_enable_direct_messages";
	public static final String PREFERENCE_KEY_NOTIFICATIONS_HAVE_SOUND = "notifications_have_sound";
	public static final String PREFERENCE_KEY_NOTIFICATIONS_HAVE_VIBRATION = "notifications_have_vibration";
	public static final String PREFERENCE_KEY_NOTIFICATIONS_HAVE_LIGHTS = "notifications_have_lights";
	public static final String PREFERENCE_KEY_REPORT_ERRORS_AUTOMATICALLY = "report_errors_automatically";
	public static final String PREFERENCE_KEY_LOCAL_TRENDS_WOEID = "local_trends_woeid";
	public static final String PREFERENCE_KEY_HIRES_PROFILE_IMAGE = "hires_profile_image";
	public static final String PREFERENCE_KEY_FORCE_SSL_CONNECTION = "force_ssl_connection";

	public static final String PREFERENCE_DEFAULT_QUOTE_FORMAT = "RT [TEXT]";
	public static final int PREFERENCE_DEFAULT_DATABASE_ITEM_LIMIT = 100;
	public static final int PREFERENCE_DEFAULT_LOAD_ITEM_LIMIT = 20;
	public static final float PREFERENCE_DEFAULT_TEXT_SIZE = 14.0f;

	public static final String QUOTE_FORMAT_TEXT_PATTERN = "[TEXT]";

	public static final String INTENT_PACKAGE_PREFIX = "org.mariotaku.twidere.";

	public static final String INTENT_ACTION_SERVICE = INTENT_PACKAGE_PREFIX + "SERVICE";
	public static final String INTENT_ACTION_HOME = INTENT_PACKAGE_PREFIX + "HOME";
	public static final String INTENT_ACTION_COMPOSE = INTENT_PACKAGE_PREFIX + "COMPOSE";
	public static final String INTENT_ACTION_SETTINGS = INTENT_PACKAGE_PREFIX + "SETTINGS";
	public static final String INTENT_ACTION_SELECT_ACCOUNT = INTENT_PACKAGE_PREFIX + "SELECT_ACCOUNT";
	public static final String INTENT_ACTION_VIEW_IMAGE = INTENT_PACKAGE_PREFIX + "VIEW_IMAGE";
	public static final String INTENT_ACTION_FILTERS = INTENT_PACKAGE_PREFIX + "FILTERS";
	public static final String INTENT_ACTION_ABOUT = INTENT_PACKAGE_PREFIX + "ABOUT";
	public static final String INTENT_ACTION_EDIT_API = INTENT_PACKAGE_PREFIX + "EDIT_API";
	public static final String INTENT_ACTION_SET_COLOR = INTENT_PACKAGE_PREFIX + "SET_COLOR";
	public static final String INTENT_ACTION_TWITTER_LOGIN = INTENT_PACKAGE_PREFIX + "TWITTER_LOGIN";
	public static final String INTENT_ACTION_DRAFTS = INTENT_PACKAGE_PREFIX + "DRAFTS";
	public static final String INTENT_ACTION_DIRECT_MESSAGES = INTENT_PACKAGE_PREFIX + "DIRECT_MESSAGES";
	public static final String INTENT_ACTION_SAVE_FILE = INTENT_PACKAGE_PREFIX + "SAVE_FILE";
	public static final String INTENT_ACTION_VIEW_WEBPAGE = INTENT_PACKAGE_PREFIX + "VIEW_WEBPAGE";
	public static final String INTENT_ACTION_EXTENSIONS = INTENT_PACKAGE_PREFIX + "EXTENSIONS";

	public static final String INTENT_ACTION_EXTENSION_EDIT_IMAGE = INTENT_PACKAGE_PREFIX + "EXTENSION_EDIT_IMAGE";
	public static final String INTENT_ACTION_EXTENSION_UPLOAD = INTENT_PACKAGE_PREFIX + "EXTENSION_UPLOAD";
	public static final String INTENT_ACTION_EXTENSION_OPEN_STATUS = INTENT_PACKAGE_PREFIX + "EXTENSION_OPEN_STATUS";
	public static final String INTENT_ACTION_EXTENSION_OPEN_USER = INTENT_PACKAGE_PREFIX + "EXTENSION_OPEN_USER";
	public static final String INTENT_ACTION_EXTENSION_OPEN_USER_LIST = INTENT_PACKAGE_PREFIX + "EXTENSION_OPEN_USER_LIST";
	public static final String INTENT_ACTION_EXTENSION_SETTINGS = INTENT_PACKAGE_PREFIX + "EXTENSION_SETTINGS";

	public static final String BROADCAST_HOME_TIMELINE_DATABASE_UPDATED = INTENT_PACKAGE_PREFIX
			+ "HOME_TIMELINE_DATABASE_UPDATED";
	public static final String BROADCAST_MENTIONS_DATABASE_UPDATED = INTENT_PACKAGE_PREFIX
			+ "MENTIONS_DATABASE_UPDATED";
	public static final String BROADCAST_ACCOUNT_LIST_DATABASE_UPDATED = INTENT_PACKAGE_PREFIX
			+ "ACCOUNT_LIST_DATABASE_UPDATED";
	public static final String BROADCAST_DRAFTS_DATABASE_UPDATED = INTENT_PACKAGE_PREFIX + "DRAFTS_DATABASE_UPDATED";
	public static final String BROADCAST_HOME_TIMELINE_REFRESHED = INTENT_PACKAGE_PREFIX + "HOME_TIMELINE_REFRESHED";
	public static final String BROADCAST_MENTIONS_REFRESHED = INTENT_PACKAGE_PREFIX + "MENTIONS_REFRESHED";
	public static final String BROADCAST_REFRESHSTATE_CHANGED = INTENT_PACKAGE_PREFIX + "REFRESHSTATE_CHANGED";
	public static final String BROADCAST_NOTIFICATION_CLEARED = INTENT_PACKAGE_PREFIX + "NOTIFICATION_CLEARED";
	public static final String BROADCAST_FRIENDSHIP_CHANGED = INTENT_PACKAGE_PREFIX + "FRIENDSHIP_CHANGED";
	public static final String BROADCAST_BLOCKSTATE_CHANGED = INTENT_PACKAGE_PREFIX + "BLOCKSTATE_CHANGED";
	public static final String BROADCAST_PROFILE_UPDATED = INTENT_PACKAGE_PREFIX + "PROFILE_UPDATED";
	public static final String BROADCAST_USER_LIST_DETAILS_UPDATED = INTENT_PACKAGE_PREFIX
			+ "USER_LIST_DETAILS_UPDATED";
	public static final String BROADCAST_DATABASE_UPDATED = INTENT_PACKAGE_PREFIX + "DATABASE_UPDATED";
	public static final String BROADCAST_FAVORITE_CHANGED = INTENT_PACKAGE_PREFIX + "FAVORITE_CHANGED";
	public static final String BROADCAST_RECEIVED_DIRECT_MESSAGES_REFRESHED = INTENT_PACKAGE_PREFIX
			+ "RECEIVED_DIRECT_MESSAGES_REFRESHED";
	public static final String BROADCAST_SENT_DIRECT_MESSAGES_REFRESHED = INTENT_PACKAGE_PREFIX
			+ "SENT_DIRECT_MESSAGES_REFRESHED";
	public static final String BROADCAST_RECEIVED_DIRECT_MESSAGES_DATABASE_UPDATED = INTENT_PACKAGE_PREFIX
			+ "RECEIVED_DIRECT_MESSAGES_DATABASE_UPDATED";
	public static final String BROADCAST_SENT_DIRECT_MESSAGES_DATABASE_UPDATED = INTENT_PACKAGE_PREFIX
			+ "SENT_DIRECT_MESSAGES_DATABASE_UPDATED";
	public static final String BROADCAST_STATUS_DESTROYED = INTENT_PACKAGE_PREFIX + "STATUS_DESTROYED";
	public static final String BROADCAST_TRENDS_UPDATED = INTENT_PACKAGE_PREFIX + "TRENDS_UPDATED";
	public static final String BROADCAST_USER_LIST_MEMBER_DELETED = INTENT_PACKAGE_PREFIX + "USER_LIST_MEMBER_DELETED";
	public static final String BROADCAST_USER_LIST_SUBSCRIPTION_CHANGED = INTENT_PACKAGE_PREFIX
			+ "USER_LIST_SUBSCRIPTION_CHANGED";
	public static final String BROADCAST_USER_LIST_CREATED = INTENT_PACKAGE_PREFIX + "USER_LIST_CREATED";
	public static final String BROADCAST_USER_LIST_DELETED = INTENT_PACKAGE_PREFIX + "USER_LIST_DELETED";

	public static final String INTENT_KEY_LATITUDE = "latitude";
	public static final String INTENT_KEY_LONGITUDE = "longitude";
	public static final String INTENT_KEY_URI = "uri";
	public static final String INTENT_KEY_MENTIONS = "mentions";
	public static final String INTENT_KEY_ACCOUNT_ID = "account_id";
	public static final String INTENT_KEY_CONVERSATION_ID = "conversation_id";
	public static final String INTENT_KEY_PAGE = "page";
	public static final String INTENT_KEY_DATA = "data";
	public static final String INTENT_KEY_QUERY = "query";
	public static final String INTENT_KEY_QUERY_TYPE = "query_type";
	public static final String INTENT_KEY_USER_ID = "user_id";
	public static final String INTENT_KEY_LIST_ID = "list_id";
	public static final String INTENT_KEY_MAX_ID = "max_id";
	public static final String INTENT_KEY_MIN_ID = "min_id";
	public static final String INTENT_KEY_STATUS_ID = "status_id";
	public static final String INTENT_KEY_SCREEN_NAME = "screen_name";
	public static final String INTENT_KEY_LIST_NAME = "list_name";
	public static final String INTENT_KEY_DESCRIPTION = "description";
	public static final String INTENT_KEY_IN_REPLY_TO_ID = "in_reply_to_id";
	public static final String INTENT_KEY_IN_REPLY_TO_NAME = "in_reply_to_name";
	public static final String INTENT_KEY_IN_REPLY_TO_SCREEN_NAME = "in_reply_to_screen_name";
	public static final String INTENT_KEY_TEXT = "text";
	public static final String INTENT_KEY_TITLE = "title";
	public static final String INTENT_KEY_TYPE = "type";
	public static final String INTENT_KEY_SUCCEED = "succeed";
	public static final String INTENT_KEY_IDS = "ids";
	public static final String INTENT_KEY_IS_QUOTE = "is_quote";
	public static final String INTENT_KEY_IS_SHARE = "is_share";
	public static final String INTENT_KEY_STATUS = "status";
	public static final String INTENT_KEY_FAVORITED = "favorited";
	public static final String INTENT_KEY_FILENAME = "filename";
	public static final String INTENT_KEY_FILE_SOURCE = "file_source";
	public static final String INTENT_KEY_ITEMS_INSERTED = "items_inserted";
	public static final String INTENT_KEY_INITIAL_TAB = "initial_tab";
	public static final String INTENT_KEY_NOTIFICATION_ID = "notification_id";
	public static final String INTENT_KEY_FROM_NOTIFICATION = "from_notification";
	public static final String INTENT_KEY_IS_PUBLIC = "is_public";
	public static final String INTENT_KEY_USER = "user";
	public static final String INTENT_KEY_USER_LIST = "user_list";

	public static final int REQUEST_TAKE_PHOTO = 1;
	public static final int REQUEST_PICK_IMAGE = 2;
	public static final int REQUEST_SELECT_ACCOUNT = 3;
	public static final int REQUEST_COMPOSE = 4;
	public static final int REQUEST_EDIT_API = 5;
	public static final int REQUEST_GOTO_AUTHORIZATION = 6;
	public static final int REQUEST_SET_COLOR = 7;
	public static final int REQUEST_SAVE_FILE = 8;

	public static final int RESULT_UNKNOWN_ERROR = -1;
	public static final int RESULT_SUCCESS = 0;
	public static final int RESULT_ALREADY_LOGGED_IN = 1;
	public static final int RESULT_OPEN_BROWSER = 2;

	public static final String TABLE_ACCOUNTS = Accounts.CONTENT_PATH;
	public static final String TABLE_STATUSES = Statuses.CONTENT_PATH;
	public static final String TABLE_MENTIONS = Mentions.CONTENT_PATH;
	public static final String TABLE_DRAFTS = Drafts.CONTENT_PATH;
	public static final String TABLE_CACHED_USERS = CachedUsers.CONTENT_PATH;
	public static final String TABLE_FILTERED_USERS = Filters.Users.CONTENT_PATH;
	public static final String TABLE_FILTERED_KEYWORDS = Filters.Keywords.CONTENT_PATH;
	public static final String TABLE_FILTERED_SOURCES = Filters.Sources.CONTENT_PATH;
	public static final String TABLE_DIRECT_MESSAGES = DirectMessages.CONTENT_PATH;
	public static final String TABLE_DIRECT_MESSAGES_INBOX = DirectMessages.Inbox.CONTENT_PATH;
	public static final String TABLE_DIRECT_MESSAGES_OUTBOX = DirectMessages.Outbox.CONTENT_PATH;
	public static final String TABLE_DIRECT_MESSAGES_CONVERSATION = DirectMessages.Conversation.CONTENT_PATH;
	public static final String TABLE_DIRECT_MESSAGES_CONVERSATION_SCREEN_NAME = DirectMessages.Conversation.CONTENT_PATH_SCREEN_NAME;
	public static final String TABLE_DIRECT_MESSAGES_CONVERSATIONS_ENTRY = DirectMessages.ConversationsEntry.CONTENT_PATH;
	public static final String TABLE_TRENDS_DAILY = CachedTrends.Daily.CONTENT_PATH;
	public static final String TABLE_TRENDS_WEEKLY = CachedTrends.Weekly.CONTENT_PATH;
	public static final String TABLE_TRENDS_LOCAL = CachedTrends.Local.CONTENT_PATH;

	public static final int URI_ACCOUNTS = 1;
	public static final int URI_STATUSES = 2;
	public static final int URI_MENTIONS = 3;
	public static final int URI_DRAFTS = 4;
	public static final int URI_CACHED_USERS = 5;
	public static final int URI_FILTERED_USERS = 6;
	public static final int URI_FILTERED_KEYWORDS = 7;
	public static final int URI_FILTERED_SOURCES = 8;
	public static final int URI_DIRECT_MESSAGES = 9;
	public static final int URI_DIRECT_MESSAGES_INBOX = 10;
	public static final int URI_DIRECT_MESSAGES_OUTBOX = 11;
	public static final int URI_DIRECT_MESSAGES_CONVERSATION = 12;
	public static final int URI_DIRECT_MESSAGES_CONVERSATION_SCREEN_NAME = 13;
	public static final int URI_DIRECT_MESSAGES_CONVERSATIONS_ENTRY = 14;
	public static final int URI_TRENDS_DAILY = 15;
	public static final int URI_TRENDS_WEEKLY = 16;
	public static final int URI_TRENDS_LOCAL = 17;

	public static final String DIR_NAME_PROFILE_IMAGES = "profile_images";
	public static final String DIR_NAME_CACHED_THUMBNAILS = "cached_thumbnails";

	public static final int NOTIFICATION_ID_HOME_TIMELINE = 1;
	public static final int NOTIFICATION_ID_MENTIONS = 2;
	public static final int NOTIFICATION_ID_DIRECT_MESSAGES = 3;
}