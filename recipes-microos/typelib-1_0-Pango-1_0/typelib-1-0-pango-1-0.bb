SUMMARY = "Introspection bindings for pango, a library for text layout and rendering"
DESCRIPTION = "Pango is a library for layout and rendering of text, with an emphasis \
on internationalization. It can be used anywhere that text layout \
is needed. \
 \
Pango forms the core of text and font handling for GTK+. \
 \
This package provides the GObject Introspection bindings for Pango."
LICENSE = "LGPL-2.1-or-later"

PV = "1.50.14"

RPM_NAME = "typelib-1_0-Pango-1_0-1.50.14-1.3.aarch64.rpm"
RPM_HASH = "0bfd0f087e60a3fc49f032779e1b402fbf354b15c06c7dacabefbf125942df129699ab9ad4a8be0d4c66f9ac65571caaeb4d5421c399f73ee0496c99a34daee5"

RPROVIDES:${PN} += "typelib(Pango) typelib(PangoCairo) typelib(PangoFT2) typelib(PangoFc) typelib(PangoOT) typelib(PangoXft) typelib-1_0-Pango-1_0 typelib-1_0-Pango-1_0(aarch-64)"
RDEPENDS:${PN} += "libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libpangoft2-1.0.so.0()(64bit) libpangoxft-1.0.so.0()(64bit) typelib(GLib) typelib(GObject) typelib(Gio) typelib(HarfBuzz) typelib(cairo) typelib(fontconfig) typelib(freetype2) typelib(xft) typelib(xlib)"

inherit rpm
