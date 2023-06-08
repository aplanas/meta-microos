SUMMARY = "Introspection bindings for librsvg, a SVG render library"
DESCRIPTION = "This package contains a library to render SVG (scalable vector \
graphics) data. This format has been specified by the W3C (see \
http://www.w3c.org). \
 \
This package provides the GObject Introspection bindings for librsvg."
LICENSE = "LGPL-2.0-or-later"

PV = "2.56.0"

RPM_NAME = "typelib-1_0-Rsvg-2_0-2.56.0-3.1.aarch64.rpm"
RPM_HASH = "25356dcbb94834b3c3c88f07e6786e1c21dfe8899333280a764bcdd871a529eda05afa46533d0fbfaf24fa4ed24059699bbd33d5aab5dacef2a261ffccb4ed81"

RPROVIDES:${PN} += "typelib(Rsvg) typelib-1_0-Rsvg-2_0 typelib-1_0-Rsvg-2_0(aarch-64)"
RDEPENDS:${PN} += "librsvg-2.so.2()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(GdkPixbuf) typelib(Gio) typelib(cairo)"

inherit rpm
