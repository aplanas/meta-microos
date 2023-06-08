SUMMARY = "Development files for webkit2gtk3-soup2"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.1"

RPM_NAME = "webkit2gtk3-soup2-devel-2.40.1-1.1.aarch64.rpm"
RPM_HASH = "58d82d18cda7f43ad5948f8914125e123f7e90a59cccb0fbc2fc06ebab080855656c3e947b16adfec72f80f1720e59bfd9aab5cf093584f5f4f779b49a2d496b"

RPROVIDES:${PN} += "pkgconfig(javascriptcoregtk-4.0) pkgconfig(webkit2gtk-4.0) pkgconfig(webkit2gtk-web-extension-4.0) webkit2gtk3-soup2-devel webkit2gtk3-soup2-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libjavascriptcoregtk-4_0-18 libwebkit2gtk-4_0-37 pkgconfig(glib-2.0) pkgconfig(gobject-2.0) pkgconfig(gtk+-3.0) pkgconfig(javascriptcoregtk-4.0) pkgconfig(libsoup-2.4) typelib-1_0-JavaScriptCore-4_0 typelib-1_0-WebKit2-4_0 typelib-1_0-WebKit2WebExtension-4_0"

inherit rpm
