<?xml version="1.0" encoding="utf-8"?>
<layout xmlns:android="http://schemas.android.com/apk/res/android">
	<data>
		<variable name="handlers" type="com.vogella.android.databinding.MyHandlers" />
			<variable name="user" type="com.example.User" />
	</data>
		<LinearLayout android:orientation="vertical" android:layout_width="match_parent" android:layout_height="match_parent">
			<TextView android:layout_width="wrap_content" android:layout_height="wrap_content" android:text="@{user.firstName}"
				android:onClick="@{handlers.onClickFriend}" />
			<TextView android:layout_width="wrap_content" android:layout_height="wrap_content" android:text="@{user.lastName}"
				android:onClick="@{user.isFriend ? handlers.onClickFriend : handlers.onClickEnemy}" />
		</LinearLayout>
</layout>