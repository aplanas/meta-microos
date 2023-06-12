SUMMARY = "Library to allow communication between libnfsidmap and SSSD"
DESCRIPTION = "A utility library to allow communication between libnfsidmap and SSSD."
LICENSE = "GPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "libnfsidmap-sss-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "751371fc49e5b3139177bb90d5ea0cf2886b5c37defc454b41ebdef8347d40c1c27776f80ef22200ff2c19011cd75ab17bbbe6a72117abe6bf426a18583701b7"

RPROVIDES:${PN} += "libnfsidmap-sss libnfsidmap-sss(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libnfsidmap.so.1()(64bit)"

inherit rpm
