SUMMARY = "Development files for webkit2gtk3"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.1"

RPM_NAME = "webkit2gtk3-devel-2.40.1-1.1.aarch64.rpm"
RPM_HASH = "0d92e8a7aa1fbcc1b149ed43b9eb59c6d37bb936a53d4681d8387c57a67ac21f1e36ee5833db1774a40fd6e059a0f5ebea774f3e2704b3ab8c6392993cc77394"

RPROVIDES:${PN} += "pkgconfig(javascriptcoregtk-4.1) pkgconfig(webkit2gtk-4.1) pkgconfig(webkit2gtk-web-extension-4.1) webkit2gtk3-devel webkit2gtk3-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libjavascriptcoregtk-4_1-0 libwebkit2gtk-4_1-0 pkgconfig(glib-2.0) pkgconfig(gobject-2.0) pkgconfig(gtk+-3.0) pkgconfig(javascriptcoregtk-4.1) pkgconfig(libsoup-3.0) typelib-1_0-JavaScriptCore-4_1 typelib-1_0-WebKit2-4_1 typelib-1_0-WebKit2WebExtension-4_1"

inherit rpm
