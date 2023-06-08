SUMMARY = "Introspection bindings for the HarfBuzz/GObject library"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine. \
This package provides the GObject Introspection bindings for HarfBuzz."
LICENSE = "MIT"

PV = "7.2.0"

RPM_NAME = "typelib-1_0-HarfBuzz-0_0-7.2.0-1.1.aarch64.rpm"
RPM_HASH = "a66ec32f9103b7198dea56aeb16b1555f25e2f13ceb3a6e2c1b3c433b4a8da5f781b8cf22eed043ef8302f929776030a28f3319faa0536e546c7740cbc9b3b03"

RPROVIDES:${PN} += "typelib(HarfBuzz) typelib-1_0-HarfBuzz-0_0 typelib-1_0-HarfBuzz-0_0(aarch-64)"
RDEPENDS:${PN} += "libharfbuzz-gobject.so.0()(64bit) typelib(GLib) typelib(GObject) typelib(freetype2)"

inherit rpm
