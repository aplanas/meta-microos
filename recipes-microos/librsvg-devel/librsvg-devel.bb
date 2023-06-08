SUMMARY = "Development files for librsvg, a SVG render library"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.0-or-later"

PV = "2.56.0"

RPM_NAME = "librsvg-devel-2.56.0-3.1.aarch64.rpm"
RPM_HASH = "1cb18cd5375cea2dec788bd7d115f6aebcc718c55d25d889c4d8ab664e503c707f54b71fe79ce9a87eb1237fa71b77ec8b5c319488ee95cf5baabfa30208d03b"

RPROVIDES:${PN} += "librsvg-devel librsvg-devel(aarch-64) librsvg2-devel pkgconfig(librsvg-2.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config librsvg-2-2 pkgconfig(cairo) pkgconfig(gdk-pixbuf-2.0) pkgconfig(gio-2.0) pkgconfig(glib-2.0) typelib-1_0-Rsvg-2_0"

inherit rpm
