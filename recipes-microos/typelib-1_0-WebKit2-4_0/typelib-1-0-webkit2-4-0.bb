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

RPM_NAME = "typelib-1_0-WebKit2-4_0-2.40.1-1.1.aarch64.rpm"
RPM_HASH = "a8b32046c5522148a947ce73106cc8aa5e21a8cbb7acdf3d1607d0b2c33b4019d6ab5329a5ddc3628e711b2e1f4905f79d17a467aa3e50948aa9c94a2d774878"

RPROVIDES:${PN} += "typelib(WebKit2) typelib-1_0-WebKit2-4_0 typelib-1_0-WebKit2-4_0(aarch-64)"
RDEPENDS:${PN} += "libjavascriptcoregtk-4.0.so.18()(64bit) libwebkit2gtk-4.0.so.37()(64bit) typelib(Atk) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(JavaScriptCore) typelib(Pango) typelib(Soup) typelib(cairo) typelib(freetype2) typelib(xlib)"

inherit rpm
