// Copyright (c) 2014 The Chromium Embedded Framework Authors. All rights
// reserved. Use of this source code is governed by a BSD-style license that
// can be found in the LICENSE file.

package org.cef.handler;

import org.cef.browser.CefBrowser;
import org.cef.misc.BoolRef;

/**
 * Implement this interface to handle events related to keyboard input. The
 * methods of this class will be called on the UI thread.
 */
public interface CefKeyboardHandler {
    /**
     * Structure representing keyboard event information.
     */
    public static  class CefKeyEvent {
        /**
         * Key event types.
         */
        public static enum EventType {
            /**
             * Notification that a key transitioned from "up" to "down"
             */
            KEYEVENT_RAWKEYDOWN,

            /**
             * Notification that a key was pressed. This does not necessarily
             * correspond to a character depending on the key and language. Use
             * KEYEVENT_CHAR for character input.
             */
            KEYEVENT_KEYDOWN,

            /**
             * Notification that a key was released
             */
            KEYEVENT_KEYUP,

            /**
             * Notification that a character was typed. Use this for text input. Key
             * down events may generate 0, 1, or more than one character event
             * depending on the key, locale, and operating system.
             */
            KEYEVENT_CHAR
        }

        CefKeyEvent(EventType typeAttr, int modifiersAttr, int windows_key_codeAttr,
                int native_key_codeAttr, boolean is_system_keyAttr, char characterAttr,
                char unmodified_characterAttr, boolean focus_on_editable_fieldAttr) {
            type = typeAttr;
            modifiers = modifiersAttr;
            windows_key_code = windows_key_codeAttr;
            native_key_code = native_key_codeAttr;
            is_system_key = is_system_keyAttr;
            character = characterAttr;
            unmodified_character = unmodified_characterAttr;
            focus_on_editable_field = focus_on_editable_fieldAttr;
        }

        /**
         * The type of keyboard event.
         */
        public  EventType type;

        /**
         * Bit flags describing any pressed modifier keys.
         * @see org.cef.handler.CefContextMenuHandler.EventFlags for values.
         */
        public  int modifiers;

        /**
         * The Windows key code for the key event. This value is used by the DOM
         * specification. Sometimes it comes directly from the event (i.e. on
         * Windows) and sometimes it's determined using a mapping function. See
         * WebCore/platform/chromium/KeyboardCodes.h for the list of values.
         */
        public  int windows_key_code;

        /**
         * The actual key code genenerated by the platform.
         */
        public  int native_key_code;

        /**
         * Indicates whether the event is considered a "system key" event (see
         * http://msdn.microsoft.com/en-us/library/ms646286(VS.85).aspx for details).
         * This value will always be false on non-Windows platforms.
         */
        public  boolean is_system_key;

        /**
         * The character generated by the keystroke.
         */
        public  char character;

        /**
         * Same as character but unmodified by any concurrently-held modifiers
         * (except shift). This is useful for working out shortcut keys.
         **/
        public  char unmodified_character;

        /**
         * True if the focus is currently on an editable field on the page. This is
         * useful for determining if standard key events should be intercepted.
         */
        public  boolean focus_on_editable_field;

        @Override
        public String toString() {
            return "CefKeyEvent [type=" + type + ", modifiers=" + modifiers
                    + ", windows_key_code=" + windows_key_code
                    + ", native_key_code=" + native_key_code + ", is_system_key=" + is_system_key
                    + ", character=" + character + ", unmodified_character=" + unmodified_character
                    + ", focus_on_editable_field=" + focus_on_editable_field + "]";
        }
    }

    /**
     * Called before a keyboard event is sent to the renderer.
     *
     * @param browser the corresponding browser.
     * @param event contains information about the keyboard event.
     * @param is_keyboard_shortcut set to true and return false, if
     *  the event will be handled in OnKeyEvent() as a keyboard shortcut.
     * @return true if the event was handled or false otherwise.
     */
    public boolean onPreKeyEvent(
            CefBrowser browser, CefKeyEvent event, BoolRef is_keyboard_shortcut);

    /**
     * Called after the renderer and JavaScript in the page has had a chance to
     * handle the event.
     *
     * @param browser  the corresponding browser.
     * @param event contains information about the keyboard event.
     * @return true if the keyboard event was handled or false otherwise.
     */
    public boolean onKeyEvent(CefBrowser browser, CefKeyEvent event);
}
