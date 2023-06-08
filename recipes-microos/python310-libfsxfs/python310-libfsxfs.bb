SUMMARY = "Library and tools for accessing the SGI X File System (XFS)"
DESCRIPTION = "libfsxfs is a library to access the SGI X File System (XFS). \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220829"

RPM_NAME = "python310-libfsxfs-20220829-3.8.aarch64.rpm"
RPM_HASH = "23837039dcedb528db0cfbc8aa89fd7c1cf045c9d0c618f7b654024c1f214002801bf6b84723d7604e360c8988eda3a53207005176f70e42a0a6def51ac98b5d"

RPROVIDES:${PN} += "python3-libfsxfs python310-libfsxfs python310-libfsxfs(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libfsxfs.so.1()(64bit) libfsxfs.so.1(V_20220829)(64bit) python(abi)"

inherit rpm
