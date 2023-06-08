SUMMARY = "Filesystem detection library"
DESCRIPTION = "Library for filesystem detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.38.1"

RPM_NAME = "libblkid1-2.38.1-12.1.aarch64.rpm"
RPM_HASH = "d8786a267e3b7c7098c8766eb60d8003544dd3a50c8328f0ef996c1b66a4e6b50d8e849fa7f35e03ab4fb7199fe6f78daa5cd9d3b13a20f292f9070dbe1643a2"

RPROVIDES:${PN} += "libblkid.so.1()(64bit) libblkid.so.1(BLKID_1.0)(64bit) libblkid.so.1(BLKID_2.15)(64bit) libblkid.so.1(BLKID_2.17)(64bit) libblkid.so.1(BLKID_2.18)(64bit) libblkid.so.1(BLKID_2.20)(64bit) libblkid.so.1(BLKID_2.21)(64bit) libblkid.so.1(BLKID_2.23)(64bit) libblkid.so.1(BLKID_2.25)(64bit) libblkid.so.1(BLKID_2.30)(64bit) libblkid.so.1(BLKID_2_31)(64bit) libblkid.so.1(BLKID_2_36)(64bit) libblkid.so.1(BLKID_2_37)(64bit) libblkid1 libblkid1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
