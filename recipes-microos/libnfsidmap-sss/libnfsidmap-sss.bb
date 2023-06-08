SUMMARY = "Library to allow communication between libnfsidmap and SSSD"
DESCRIPTION = "A utility library to allow communication between libnfsidmap and SSSD."
LICENSE = "GPL-3.0-or-later"

PV = "2.8.2"

RPM_NAME = "libnfsidmap-sss-2.8.2-4.3.aarch64.rpm"
RPM_HASH = "7e3f1a85de699a7b1b11289588a60742d2f326a5b47adedda0bdcf544e23fff4204f0b1aa674a83949fd08586a59c8e77c7ca748ce2e3b7ac9c6b1a22b4c3403"

RPROVIDES:${PN} += "libnfsidmap-sss libnfsidmap-sss(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libnfsidmap.so.1()(64bit)"

inherit rpm
