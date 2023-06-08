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

RPM_NAME = "python39-libfsext-20220829-3.9.aarch64.rpm"
RPM_HASH = "b31917fcacaa13f1f0615ee0d5701a68cd4939a8727658d8e842e8996454278b350b4afc2864785c0bdd105cc51abe328f052b73ba51c5337ce4c6b66fda7abe"

RPROVIDES:${PN} += "python39-libfsext python39-libfsext(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libfsext.so.1()(64bit) libfsext.so.1(V_20220829)(64bit) python(abi)"

inherit rpm
