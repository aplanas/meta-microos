SUMMARY = "VPD Database access library for lsvpd"
DESCRIPTION = "The libvpd-devel package contains development libraries and header \
files that are used to access a vpd database created by vpdupdate in \
the lsvpd package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.9"

RPM_NAME = "libvpd-devel-2.2.9-3.3.aarch64.rpm"
RPM_HASH = "a9025bfbc14c6bb525b7e5eb4c6cfc4bcddbac822e1f6a4d03440fb004a0706912eb3617fcd4b005ad50384627f6aec877d83446505b3d6f67cae81f0e680792"

RPROVIDES:${PN} += "libvpd-devel libvpd-devel(aarch-64) pkgconfig(libvpd-2) pkgconfig(libvpd_cxx-2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libvpd-2_2-3 pkgconfig(sqlite3)"

inherit rpm
