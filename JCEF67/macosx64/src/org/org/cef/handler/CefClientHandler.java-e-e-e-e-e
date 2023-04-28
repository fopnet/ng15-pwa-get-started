// Copyright (c) 2014 The Chromium Embedded Framework Authors. All rights
// reserved. Use of this source code is governed by a BSD-style license that
// can be found in the LICENSE file.

package org.cef.handler;

import org.cef.browser.CefBrowser;
import org.cef.browser.CefMessageRouter;
import org.cef.callback.CefNative;

import java.util.HashMap;
import java.util.Vector;

/**
 * Implement this interface to provide handler implementations.
 */
public abstract class CefClientHandler implements CefNative {
    // Used internally to store a pointer to the CEF object.
    public HashMap<String, Long> N_CefHandle = new HashMap<String, Long>();
    public Vector<CefMessageRouter> msgRouters = new Vector<>();

    @Override
    public void setNativeRef(String identifer, long nativeRef) {
        synchronized (N_CefHandle) {
            N_CefHandle.put(identifer, nativeRef);
        }
    }

    @Override
    public long getNativeRef(String identifer) {
        synchronized (N_CefHandle) {
            if (N_CefHandle.containsKey(identifer)) return N_CefHandle.get(identifer);
        }
        return 0;
    }

    public CefClientHandler() {
        try {
            N_CefClientHandler_CTOR();
        } catch (UnsatisfiedLinkError err) {
            err.printStackTrace();
        }
    }

    public void dispose() {
        try {
            // Call native DTOR if handler will be destroyed
            for (int i = 0; i < msgRouters.size(); i++) {
                msgRouters.get(i).dispose();
            }
            msgRouters.clear();

            N_CefClientHandler_DTOR();
        } catch (UnsatisfiedLinkError err) {
            err.printStackTrace();
        }
    }

    /**
     * Returns the java part of the browser implementation.
     * @param identifer the unique identifier of the browser.
     * @return The found browser or null if none is found.
     */
    abstract public CefBrowser getBrowser(int identifier);

    /**
     * Returns a list of all browser instances.
     * @return an array of browser Instances.
     */
    abstract public Object[] getAllBrowser();

    /**
     * Return the handler for context menus. If no handler is provided the
     * default implementation will be used.
     */
    abstract public CefContextMenuHandler getContextMenuHandler();

    /**
     * Return the handler for dialogs. If no handler is provided the
     * default implementation will be used.
     */
    abstract public CefDialogHandler getDialogHandler();

    /**
     * Return the handler for browser display state events.
     * This method is a callback method and is called by
     * the native code.
     */
    abstract public CefDisplayHandler getDisplayHandler();

    /**
     * Return the handler for download events.
     * This method is a callback method and is called by
     * the native code.
     */
    abstract public CefDownloadHandler getDownloadHandler();

    /**
     * Return the handler for drag events.
     * This method is a callback method and is called by
     * the native code.
     */
    abstract public CefDragHandler getDragHandler();

    /**
     * Return the handler for focus events.
     * This method is a callback method and is called by
     * the native code.
     */
    abstract public CefFocusHandler getFocusHandler();

    /**
     * Return the handler for javascript dialog requests.
     * This method is a callback method and is called by
     * the native code.
     */
    abstract public CefJSDialogHandler getJSDialogHandler();

    /**
     * Return the handler for keyboard events.
     * This method is a callback method and is called by
     * the native code.
     */
    abstract public CefKeyboardHandler getKeyboardHandler();

    /**
     * Return the handler for browser life span events.
     * This method is a callback method and is called by
     * the native code.
     */
    abstract public CefLifeSpanHandler getLifeSpanHandler();

    /**
     * Return the handler for browser load status events.
     * This method is a callback method and is called by
     * the native code.
     */
    abstract public CefLoadHandler getLoadHandler();

    /**
     * Return the handler for printing on Linux. If a print handler is not
     * provided then printing will not be supported on the Linux platform.
     * This method is a callback method and is called by
     * the native code.
     */
    abstract public CefPrintHandler getPrintHandler();

    /**
     * Return the handler for off-screen rendering events.
     * This method is a callback method and is called by
     * the native code.
     */
    abstract public CefRenderHandler getRenderHandler();

    /**
     * Return the handler for browser request events.
     * This method is a callback method and is called by
     * the native code.
     */
    abstract public CefRequestHandler getRequestHandler();

    /**
     * Return the handler for windowed rendering events.
     * This method is a callback method and is called by
     * the native code.
     */
    abstract public CefWindowHandler getWindowHandler();

    public synchronized void addMessageRouter(CefMessageRouter h) {
        try {
            msgRouters.add(h);
            N_addMessageRouter(h);
        } catch (UnsatisfiedLinkError err) {
            err.printStackTrace();
        }
    }

    public void removeContextMenuHandler(CefContextMenuHandler h) {
        try {
            N_removeContextMenuHandler(h);
        } catch (UnsatisfiedLinkError err) {
            err.printStackTrace();
        }
    }

    public void removeDialogHandler(CefDialogHandler h) {
        try {
            N_removeDialogHandler(h);
        } catch (UnsatisfiedLinkError err) {
            err.printStackTrace();
        }
    }

    public void removeDisplayHandler(CefDisplayHandler h) {
        try {
            N_removeDisplayHandler(h);
        } catch (UnsatisfiedLinkError err) {
            err.printStackTrace();
        }
    }

    public void removeDownloadHandler(CefDisplayHandler h) {
        try {
            N_removeDownloadHandler(h);
        } catch (UnsatisfiedLinkError err) {
            err.printStackTrace();
        }
    }

    public void removeDragHandler(CefDragHandler h) {
        try {
            N_removeDragHandler(h);
        } catch (UnsatisfiedLinkError err) {
            err.printStackTrace();
        }
    }

    public void removeFocusHandler(CefFocusHandler h) {
        try {
            N_removeFocusHandler(h);
        } catch (UnsatisfiedLinkError err) {
            err.printStackTrace();
        }
    }

    public void removeJSDialogHandler(CefJSDialogHandler h) {
        try {
            N_removeJSDialogHandler(h);
        } catch (UnsatisfiedLinkError err) {
            err.printStackTrace();
        }
    }

    public void removeKeyboardHandler(CefKeyboardHandler h) {
        try {
            N_removeKeyboardHandler(h);
        } catch (UnsatisfiedLinkError err) {
            err.printStackTrace();
        }
    }

    public void removeLifeSpanHandler(CefLifeSpanHandler h) {
        try {
            N_removeLifeSpanHandler(h);
        } catch (UnsatisfiedLinkError err) {
            err.printStackTrace();
        }
    }

    public void removeLoadHandler(CefLoadHandler h) {
        try {
            N_removeLoadHandler(h);
        } catch (UnsatisfiedLinkError err) {
            err.printStackTrace();
        }
    }

    public void removePrintHandler(CefPrintHandler h) {
        try {
            N_removePrintHandler(h);
        } catch (UnsatisfiedLinkError err) {
            err.printStackTrace();
        }
    }

    public synchronized void removeMessageRouter(CefMessageRouter h) {
        try {
            msgRouters.remove(h);
            N_removeMessageRouter(h);
        } catch (UnsatisfiedLinkError err) {
            err.printStackTrace();
        }
    }

    public void removeRenderHandler(CefRenderHandler h) {
        try {
            N_removeRenderHandler(h);
        } catch (UnsatisfiedLinkError err) {
            err.printStackTrace();
        }
    }

    public void removeRequestHandler(CefRequestHandler h) {
        try {
            N_removeRequestHandler(h);
        } catch (UnsatisfiedLinkError err) {
            err.printStackTrace();
        }
    }

    public void removeWindowHandler(CefWindowHandler h) {
        try {
            N_removeWindowHandler(h);
        } catch (UnsatisfiedLinkError err) {
            err.printStackTrace();
        }
    }

    public  native void N_CefClientHandler_CTOR();
    public  native void N_addMessageRouter(CefMessageRouter h);
    public  native void N_removeContextMenuHandler(CefContextMenuHandler h);
    public  native void N_removeDialogHandler(CefDialogHandler h);
    public  native void N_removeDisplayHandler(CefDisplayHandler h);
    public  native void N_removeDownloadHandler(CefDisplayHandler h);
    public  native void N_removeDragHandler(CefDragHandler h);
    public  native void N_removeFocusHandler(CefFocusHandler h);
    public  native void N_removeJSDialogHandler(CefJSDialogHandler h);
    public  native void N_removeKeyboardHandler(CefKeyboardHandler h);
    public  native void N_removeLifeSpanHandler(CefLifeSpanHandler h);
    public  native void N_removeLoadHandler(CefLoadHandler h);
    public  native void N_removePrintHandler(CefPrintHandler h);
    public  native void N_removeMessageRouter(CefMessageRouter h);
    public  native void N_removeRenderHandler(CefRenderHandler h);
    public  native void N_removeRequestHandler(CefRequestHandler h);
    public  native void N_removeWindowHandler(CefWindowHandler h);
    public  native void N_CefClientHandler_DTOR();
}
