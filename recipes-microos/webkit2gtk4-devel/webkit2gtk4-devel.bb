SUMMARY = "Development files for webkit2gtk4"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.1"

RPM_NAME = "webkit2gtk4-devel-2.40.1-1.1.aarch64.rpm"
RPM_HASH = "356fea0fcada1bf9c0839d63054a94bfcc1d9af28b2f8b6fbc52809a110df24bc0c6de2f41ed54e1f3855b6f6596959956ed860b82956cb628126502f2183e94"

RPROVIDES:${PN} += "pkgconfig(javascriptcoregtk-6.0) pkgconfig(webkitgtk-6.0) pkgconfig(webkitgtk-web-process-extension-6.0) webkit2gtk4-devel webkit2gtk4-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libjavascriptcoregtk6_0-1 libwebkitgtk6_0-4 pkgconfig(glib-2.0) pkgconfig(gobject-2.0) pkgconfig(gtk4) pkgconfig(javascriptcoregtk-6.0) pkgconfig(libsoup-3.0) typelib-1_0-JavaScriptCore-6_0 typelib-1_0-WebKit-6_0 typelib-1_0-WebKitWebProcessExtension-6_0"

inherit rpm
