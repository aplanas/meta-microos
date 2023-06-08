SUMMARY = "Library and tools for accessing the SGI X File System (XFS)"
DESCRIPTION = "libfsxfs is a library to access the SGI X File System (XFS). \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220829"

RPM_NAME = "python39-libfsxfs-20220829-3.8.aarch64.rpm"
RPM_HASH = "0c39f5b870f56623dfef82e0f9511b1932cd6a0e8dc73efa1150f06a531b82430339181b295a5e0c265f4fd19fb488ced4731d27cd02394748c1b2d8500e21aa"

RPROVIDES:${PN} += "python39-libfsxfs python39-libfsxfs(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libfsxfs.so.1()(64bit) libfsxfs.so.1(V_20220829)(64bit) python(abi)"

inherit rpm
