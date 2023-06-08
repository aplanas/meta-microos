SUMMARY = "Pango Integration, Introspection bindings for cogl"
DESCRIPTION = "Cogl is a library for using 3D graphics hardware to draw \
pretty pictures. \
 \
This package provides the GObject Introspection bindings for the Pango \
integration in Cogl."
LICENSE = "MIT"

PV = "1.22.8"

RPM_NAME = "typelib-1_0-CoglPango-1_0-1.22.8-2.11.aarch64.rpm"
RPM_HASH = "c55ec55b2f9f16fa090bfe1c37d4d906197e244fca7acfa6cd91b19a278cab988df0e84079a62bff9209150379b1f6fab647bbf0639864b34b8cc2c2217dee8f"

RPROVIDES:${PN} += "typelib(CoglPango) typelib-1_0-CoglPango-1_0 typelib-1_0-CoglPango-1_0(aarch-64)"
RDEPENDS:${PN} += "libcogl-pango.so.20()(64bit) libcogl.so.20()(64bit) typelib(Cogl) typelib(GL) typelib(GLib) typelib(GObject) typelib(Gio) typelib(HarfBuzz) typelib(Pango) typelib(PangoCairo) typelib(cairo) typelib(freetype2)"

inherit rpm
