SUMMARY = "Development package for ibus-table"
DESCRIPTION = "This package contains the files required for the development of ibus-table."
LICENSE = "LGPL-2.1-or-later"

PV = "1.17.0"

RPM_NAME = "ibus-table-devel-1.17.0-1.1.aarch64.rpm"
RPM_HASH = "5515b5459235ca58112b0178d40217c8f1db6aaebc8c599a9bfa3bd6b4fed9a62344780db26554982da9cffd83caf47cc8bb953975d615227a7083e2c05dcb48"

RPROVIDES:${PN} += "ibus-table-devel \
ibus-table-devel(aarch-64) \
pkgconfig(ibus-table)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
ibus-table"

inherit rpm
