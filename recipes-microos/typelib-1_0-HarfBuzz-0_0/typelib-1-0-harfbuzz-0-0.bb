SUMMARY = "Introspection bindings for the HarfBuzz/GObject library"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine. \
This package provides the GObject Introspection bindings for HarfBuzz."
LICENSE = "MIT"

PV = "7.3.0"

RPM_NAME = "typelib-1_0-HarfBuzz-0_0-7.3.0-1.2.aarch64.rpm"
RPM_HASH = "aa9cf8306710aad043a7cdcfb1295f77775845c3e236182dce4fe622501988af83bab4f096cdaadc5d3a760db7033791b291249a59e8c4f7a283e54c6fc54e26"

RPROVIDES:${PN} += "typelib(HarfBuzz) \
typelib-1_0-HarfBuzz-0_0 \
typelib-1_0-HarfBuzz-0_0(aarch-64)"
RDEPENDS:${PN} += "libharfbuzz-gobject.so.0()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(freetype2)"

inherit rpm
