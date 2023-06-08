SUMMARY = "Introspection bindings for gcr, a library for crypto UI related tasks"
DESCRIPTION = "GCR is a library for displaying certificates, and crypto UI, accessing \
key stores. \
 \
This package provides the GObject Introspection bindings for GCR."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.0"

RPM_NAME = "typelib-1_0-GcrUi-3-3.41.0-3.3.aarch64.rpm"
RPM_HASH = "a5a8bf691747929136747a34b7904ae33e5339a612b6919d01de33ce7ad2cc6af6491eaa1bb7a2ef02279fa2ead0279758b22af697ef0b371cc255905c991733"

RPROVIDES:${PN} += "typelib(GcrUi) typelib-1_0-GcrUi-3 typelib-1_0-GcrUi-3(aarch-64)"
RDEPENDS:${PN} += "libgcr-ui-3.so.1()(64bit) typelib(Atk) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gck) typelib(Gcr) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(Pango) typelib(cairo) typelib(freetype2) typelib(xlib)"

inherit rpm
