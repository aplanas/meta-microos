SUMMARY = "Development files for the Poppler Glib wrapper library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.04.0"

RPM_NAME = "libpoppler-glib-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "3a6c4cc14b013c5b2518cee5e38c311fef336ef2e755111979d210c2d8dd43eca665ae4e77fae6880c2c7ba702120bbb3b38c9a6a06100408ae8870c04476a83"

RPROVIDES:${PN} += "libpoppler-glib-devel libpoppler-glib-devel(aarch-64) pkgconfig(poppler-glib)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libpoppler-glib8 pkgconfig(cairo) pkgconfig(glib-2.0) pkgconfig(gobject-2.0) pkgconfig(poppler) typelib-1_0-Poppler-0_18"

inherit rpm
