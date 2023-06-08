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

RPM_NAME = "python310-libfsext-20220829-3.9.aarch64.rpm"
RPM_HASH = "f5851b120f72f0dce2279a4b0d36702108a7b562e5842dd72a6d5eb4a01c1ed5779b351ab6d25d97ca3b668f47d28dd1905f478ce1894d5bec8d541a8a03c60f"

RPROVIDES:${PN} += "python3-libfsext python310-libfsext python310-libfsext(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libfsext.so.1()(64bit) libfsext.so.1(V_20220829)(64bit) python(abi)"

inherit rpm
