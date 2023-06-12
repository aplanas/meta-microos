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

PV = "20230603"

RPM_NAME = "python39-libfsext-20230603-1.1.aarch64.rpm"
RPM_HASH = "1cb8cccf20893d8402cef7ca95b7c8fddedc72ac7e71bd94ce188d6a567857936e84576ea16ad7a722e15a37d74def161f1e183e77787fdda30f69c3e0297708"

RPROVIDES:${PN} += "python39-libfsext python39-libfsext(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libfsext.so.1()(64bit) libfsext.so.1(V_20230603)(64bit) python(abi)"

inherit rpm
