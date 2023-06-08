SUMMARY = "Library and tools for accessing the FAT filesystem"
DESCRIPTION = "libfsfat is a library to access the File Allocation Table (FAT) file \
system format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220925"

RPM_NAME = "python39-libfsfat-20220925-3.9.aarch64.rpm"
RPM_HASH = "dd9f7546fc6386abbd9304a014cd7423c01593408e14868736a41619be0147de79175e1bfc91e70242c72a524803cc16dace5e551b8bc02b8487e55aed603ccd"

RPROVIDES:${PN} += "python39-libfsfat python39-libfsfat(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libfsfat.so.1()(64bit) libfsfat.so.1(V_20220925)(64bit) python(abi)"

inherit rpm
