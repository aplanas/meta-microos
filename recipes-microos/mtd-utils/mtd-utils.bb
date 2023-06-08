SUMMARY = "Tools for maintaining Memory Technology Devices"
DESCRIPTION = "This package contains tools for erasing and formatting flash devices, \
including JFFS2, M-Systems DiskOnChip devices, etc."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.2"

RPM_NAME = "mtd-utils-2.1.2-1.13.aarch64.rpm"
RPM_HASH = "372b28ca67d4297b4a4a5674fc9992c8c15540f63791365ba33e6ab4ff8f06b29f6aa3b7ecacd1ff3e9f9239045ce6e18b6de11b0a0f486cd631620b934f0e36"

RPROVIDES:${PN} += "mtd-utils mtd-utils(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) liblzo2.so.2()(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
