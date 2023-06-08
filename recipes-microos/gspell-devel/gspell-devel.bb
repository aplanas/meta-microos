SUMMARY = "Development files for the GTK+ spell checker library"
DESCRIPTION = "gspell provides a flexible API to implement the spell checking in a GTK+ \
application. \
 \
This package provides the files necessary for developing software using \
gspell."
LICENSE = "LGPL-2.1-or-later"

PV = "1.12.1"

RPM_NAME = "gspell-devel-1.12.1-1.1.aarch64.rpm"
RPM_HASH = "795203417f20747aad5f3e355d4753ece23a23bc23a1d103a2a6a7d2ddea4900b84616577a0999317ccf62d353a620777b6b0ec1adff1d00400d7d15c4246269"

RPROVIDES:${PN} += "gspell-devel gspell-devel(aarch-64) pkgconfig(gspell-1)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libgspell-1-2 pkgconfig(enchant-2) pkgconfig(glib-2.0) pkgconfig(gtk+-3.0) pkgconfig(icu-uc) typelib-1_0-Gspell-1"

inherit rpm
