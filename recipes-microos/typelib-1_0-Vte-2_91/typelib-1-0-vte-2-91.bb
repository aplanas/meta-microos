SUMMARY = "Introspection bindings for the VTE terminal emulator library"
DESCRIPTION = "VTE is a terminal emulator library that provides a terminal widget for \
use with GTK+ as well as handling of child process and terminal \
emulation settings. \
 \
This package provides the GObject Introspection bindings for VTE."
LICENSE = "LGPL-2.0-only"

PV = "0.72.1"

RPM_NAME = "typelib-1_0-Vte-2_91-0.72.1-1.1.aarch64.rpm"
RPM_HASH = "73f28343d6ed8690fec724299a3d6196f081e1eaee79ec46e0d57546f199d075e1378b22c746a93f6e9e58be37f13f54fdcdcb8fb64221cb8325249229ffd40e"

RPROVIDES:${PN} += "typelib(Vte) typelib-1_0-Vte-2_91 typelib-1_0-Vte-2_91(aarch-64)"
RDEPENDS:${PN} += "libvte-2.91.so.0()(64bit) typelib(Atk) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(Pango) typelib(cairo) typelib(freetype2) typelib(xlib)"

inherit rpm
