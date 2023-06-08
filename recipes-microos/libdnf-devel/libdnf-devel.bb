SUMMARY = "Development files for libdnf"
DESCRIPTION = "This package provides the headers and libraries for developing applications \
that use libdnf."
LICENSE = "LGPL-2.1-or-later"

PV = "0.70.0"

RPM_NAME = "libdnf-devel-0.70.0-1.3.aarch64.rpm"
RPM_HASH = "b14d91be53976f942403aa102867159fb85ba14eeb796780140cdd89ca06def7d36af944246375ae2ce19438f13e630bc09968872e1fd06d898e8fcc2f694d2c"

RPROVIDES:${PN} += "libdnf-devel libdnf-devel(aarch-64) pkgconfig(libdnf)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libdnf2(aarch-64) pkgconfig(glib-2.0) pkgconfig(librepo) pkgconfig(libsolv) pkgconfig(libsolvext) pkgconfig(rpm) pkgconfig(sqlite3)"

inherit rpm
