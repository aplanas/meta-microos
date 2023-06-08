SUMMARY = "Development headers and libraries for libapparmor"
DESCRIPTION = "These libraries are needed for developing software that makes use of the \
AppArmor API."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.3"

RPM_NAME = "libapparmor-devel-3.1.3-2.1.aarch64.rpm"
RPM_HASH = "242436cb9625c8bb609de8b450b26e3abe96e407ed59b58a22b224227eb322ae4e61bb6112f2d282f648b03c34b0f4a9487fcd81cc6938e7f5a274795bb2c3c3"

RPROVIDES:${PN} += "libapparmor-devel libapparmor-devel(aarch-64) libapparmor:/usr/include/sys/apparmor.h pkgconfig(libapparmor)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libapparmor1"

inherit rpm
