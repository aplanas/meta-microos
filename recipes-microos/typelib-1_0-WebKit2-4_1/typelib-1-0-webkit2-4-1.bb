SUMMARY = "Introspection bindings for webkit2gtk3"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more. \
 \
This package provides the GObject Introspection bindings for the GTK+ \
port of WebKit2."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.1"

RPM_NAME = "typelib-1_0-WebKit2-4_1-2.40.1-1.1.aarch64.rpm"
RPM_HASH = "ffd93720f5f640c6202e5f7259f0279c5a74395082500f3b54c1f92b6ed9c7d1cde0041ae0fbbe6b5900d5c48d0a649124f6c12bc00fc77ff275ce4d0c15c10e"

RPROVIDES:${PN} += "typelib(WebKit2) typelib-1_0-WebKit2-4_1 typelib-1_0-WebKit2-4_1(aarch-64)"
RDEPENDS:${PN} += "libjavascriptcoregtk-4.1.so.0()(64bit) libwebkit2gtk-4.1.so.0()(64bit) typelib(Atk) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(JavaScriptCore) typelib(Pango) typelib(Soup) typelib(cairo) typelib(freetype2) typelib(xlib)"

inherit rpm
