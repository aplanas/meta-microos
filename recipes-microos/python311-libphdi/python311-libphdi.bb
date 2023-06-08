SUMMARY = "Library and tools to access the Parallels Hard Disk images"
DESCRIPTION = "libphdi is a library to access the Parallels Hard Disk image format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "python311-libphdi-20221025-3.8.aarch64.rpm"
RPM_HASH = "2b00bb17f2f5eb5f87a9becce72a13fc64e25060a0436af2ecc03f2d369630bf1171bc5bb0d9cef6f9141254a2c23df7f8b52fb671bd1a8c34cab3751053f484"

RPROVIDES:${PN} += "python311-libphdi python311-libphdi(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libphdi.so.1()(64bit) libphdi.so.1(V_20221025)(64bit) python(abi)"

inherit rpm
