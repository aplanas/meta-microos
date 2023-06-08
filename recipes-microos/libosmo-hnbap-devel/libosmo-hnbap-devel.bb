SUMMARY = "Development files for Osmocom HNBAP library"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of libosmo-hnbap."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "libosmo-hnbap-devel-1.3.0-1.3.aarch64.rpm"
RPM_HASH = "3620555d61ff4d4c9aa2c44a1d737c1e55f84608db48eb98129dad04a95e6026bea1ef8ff14b0a3a7df24c1982baa4ad1403b1da4538b3448c2f1acdc5bd6d0e"

RPROVIDES:${PN} += "libosmo-hnbap-devel libosmo-hnbap-devel(aarch-64) pkgconfig(libosmo-hnbap)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libosmo-hnbap0"

inherit rpm
