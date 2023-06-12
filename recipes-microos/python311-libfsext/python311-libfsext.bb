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

RPM_NAME = "python311-libfsext-20230603-1.1.aarch64.rpm"
RPM_HASH = "b221fb28013ea6e724fa3e0c649a05324c080234abbde020c28a981ea6269264754b2e40f3a7e608ff1f7af6208fb846cce47c32c59f0ffe11bda5bd83b6f90e"

RPROVIDES:${PN} += "python311-libfsext python311-libfsext(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libfsext.so.1()(64bit) libfsext.so.1(V_20230603)(64bit) python(abi)"

inherit rpm
