SUMMARY = "Introspection bindings for webkit2gtk3-soup2"
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

RPM_NAME = "typelib-1_0-WebKit2WebExtension-4_0-2.40.1-1.1.aarch64.rpm"
RPM_HASH = "e38ecf7a42aef34a6e9fc6733bce97ace382f964cd76df64d99763850bb4aa5cdbe9cb95e170c6e0d9521bfd0ad1faf2a2db25d515e8983808fdea6a543a2d84"

RPROVIDES:${PN} += "typelib(WebKit2WebExtension) typelib-1_0-WebKit2WebExtension-4_0 typelib-1_0-WebKit2WebExtension-4_0(aarch-64)"
RDEPENDS:${PN} += "libjavascriptcoregtk-4.0.so.18()(64bit) libwebkit2gtk-4.0.so.37()(64bit) typelib(Atk) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(JavaScriptCore) typelib(Pango) typelib(Soup) typelib(cairo) typelib(freetype2) typelib(xlib)"

inherit rpm
