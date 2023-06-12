SUMMARY = "Library to create desktop components for Wayland"
DESCRIPTION = "This library is a companion library to GObject and Gtk+. \
It provides various features that are wished in the underlying \
library but are not for various reasons. In most cases, they are \
wildly out of scope for those libraries. In other cases, the design \
isn't quite generic enough to work for everyone.. \
 \
This package provides the GObject Introspection bindings for gtk-layer-shell."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later & MIT"

PV = "0.8.1"

RPM_NAME = "typelib-1_0-GtkLayerShell-0_1-0.8.1-1.1.aarch64.rpm"
RPM_HASH = "90e074003b8d6585c4a86aabadecf2e5541329118c67a129bb274970cae5aafa35d415be751f36f03acbc6b4af003d700c70a64e42a0f0d35671858a437365a8"

RPROVIDES:${PN} += "typelib(GtkLayerShell) \
typelib-1_0-GtkLayerShell-0_1 \
typelib-1_0-GtkLayerShell-0_1(aarch-64)"
RDEPENDS:${PN} += "libgtk-layer-shell.so.0()(64bit) \
typelib(Atk) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Gtk) \
typelib(HarfBuzz) \
typelib(Pango) \
typelib(cairo) \
typelib(freetype2) \
typelib(xlib)"

inherit rpm
