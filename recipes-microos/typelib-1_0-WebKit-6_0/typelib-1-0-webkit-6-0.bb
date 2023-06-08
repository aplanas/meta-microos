SUMMARY = "Introspection bindings for webkit2gtk4"
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

RPM_NAME = "typelib-1_0-WebKit-6_0-2.40.1-1.1.aarch64.rpm"
RPM_HASH = "09ae45eb740b32807d73aef1c64975f8ab4c1a68948c14ce0bdb7d0f9059507dfe9d61381d0873615acbd28f215dc2c013c258ecad0b4d8e0893702ca3240ae6"

RPROVIDES:${PN} += "typelib(WebKit) typelib-1_0-WebKit-6_0 typelib-1_0-WebKit-6_0(aarch-64)"
RDEPENDS:${PN} += "libjavascriptcoregtk-6.0.so.1()(64bit) libwebkitgtk-6.0.so.4()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Graphene) typelib(Gsk) typelib(Gtk) typelib(HarfBuzz) typelib(JavaScriptCore) typelib(Pango) typelib(PangoCairo) typelib(Soup) typelib(cairo) typelib(freetype2)"

inherit rpm
