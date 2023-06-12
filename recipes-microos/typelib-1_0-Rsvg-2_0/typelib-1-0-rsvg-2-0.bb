SUMMARY = "Introspection bindings for librsvg, a SVG render library"
DESCRIPTION = "This package contains a library to render SVG (scalable vector \
graphics) data. This format has been specified by the W3C (see \
http://www.w3c.org). \
 \
This package provides the GObject Introspection bindings for librsvg."
LICENSE = "LGPL-2.0-or-later"

PV = "2.56.1"

RPM_NAME = "typelib-1_0-Rsvg-2_0-2.56.1-1.1.aarch64.rpm"
RPM_HASH = "5a6c371ee60a715624b50c3fda0b68a853d05dc3c3e74784564c590e8700c88e75d1a99ae09922e0826042635bc42aea07dcb8e309a2df2375a6c5bfa3ac205b"

RPROVIDES:${PN} += "typelib(Rsvg) typelib-1_0-Rsvg-2_0 typelib-1_0-Rsvg-2_0(aarch-64)"
RDEPENDS:${PN} += "librsvg-2.so.2()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(GdkPixbuf) typelib(Gio) typelib(cairo)"

inherit rpm
