SUMMARY = "Introspection bindings for the Poppler PDF rendering library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC. \
 \
This package provides the GObject Introspection bindings for Poppler."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.04.0"

RPM_NAME = "typelib-1_0-Poppler-0_18-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "88a5917a233079b9a51f74935bcef7e39cd55bbbb769ff81d2bc2185e6fd2277dc853df4a1e0aee7a8be50f339e9fd3cf7427921537deefe09450433b0283f5a"

RPROVIDES:${PN} += "typelib(Poppler) typelib-1_0-Poppler-0_18 typelib-1_0-Poppler-0_18(aarch-64)"
RDEPENDS:${PN} += "libpoppler-glib.so.8()(64bit) libpoppler.so.127()(64bit) typelib(GLib) typelib(GObject) typelib(Gio) typelib(cairo)"

inherit rpm
