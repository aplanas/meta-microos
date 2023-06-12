SUMMARY = "Development files for libproxy, a library to do PAC/WPAD"
DESCRIPTION = "libproxy is a library that provides automatic proxy configuration \
management. \
 \
This subpackage contains header files for developing applications \
that want to make use of libproxy."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.18"

RPM_NAME = "libproxy-devel-0.4.18-2.1.aarch64.rpm"
RPM_HASH = "ea469dad5ff35d291d895cf3e667138e45887c6b6ee661f6fe905a1038f6c90aad8b1fc189329de2041a2f8285140ab968dd76396b41ba8814dce0242d32681f"

RPROVIDES:${PN} += "libproxy-devel libproxy-devel(aarch-64) pkgconfig(libproxy-1.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libproxy1"

inherit rpm
