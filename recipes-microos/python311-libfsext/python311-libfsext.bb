SUMMARY = "Library and tools to access the Extended File System"
DESCRIPTION = "libfsext is a library to access the Extended File System (ext). \
 \
Read-only supported ext formats: \
 \
* ext2 (version 2) \
* ext3 (version 3) \
* ext4 (version 4) \
 \
Supported ext format features: \
 \
* ext4 inline data \
 \
Unsupported ext format features: \
 \
* ext (version 1) \
* compression \
* encryption"
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220829"

RPM_NAME = "python311-libfsext-20220829-3.9.aarch64.rpm"
RPM_HASH = "20bbea94684965d7203643dc714155656596c01b064900b193c690652ae1125c9b5dc95a7ed5e5300501f682a22063d858d9696e2b8465d1a60a26007f39fdc6"

RPROVIDES:${PN} += "python311-libfsext python311-libfsext(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libfsext.so.1()(64bit) libfsext.so.1(V_20220829)(64bit) python(abi)"

inherit rpm
