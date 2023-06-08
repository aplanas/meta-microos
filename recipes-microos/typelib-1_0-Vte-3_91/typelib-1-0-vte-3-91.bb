SUMMARY = "Introspection bindings for the VTE terminal emulator library"
DESCRIPTION = "VTE is a terminal emulator library that provides a terminal widget for \
use with GTK+ as well as handling of child process and terminal \
emulation settings. \
 \
This package provides the GObject Introspection bindings for VTE."
LICENSE = "LGPL-2.0-only"

PV = "0.72.1"

RPM_NAME = "typelib-1_0-Vte-3_91-0.72.1-1.1.aarch64.rpm"
RPM_HASH = "bd08808a4620649a48caff70caaeeca01358597540ff05a95b9b3316fb6598cf7700de12aa8355f1ca67a00850e2a85de08d1cf270893b6460cadfd007b5adc0"

RPROVIDES:${PN} += "typelib(Vte) typelib-1_0-Vte-3_91 typelib-1_0-Vte-3_91(aarch-64)"
RDEPENDS:${PN} += "libvte-2.91-gtk4.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Graphene) typelib(Gsk) typelib(Gtk) typelib(HarfBuzz) typelib(Pango) typelib(PangoCairo) typelib(cairo) typelib(freetype2)"

inherit rpm
