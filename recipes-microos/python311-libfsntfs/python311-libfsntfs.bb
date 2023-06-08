SUMMARY = "Library and tools to access the NTFS filesystem"
DESCRIPTION = "Library and tools to access the New Technology File System (NTFS). \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230427"

RPM_NAME = "python311-libfsntfs-20230427-1.1.aarch64.rpm"
RPM_HASH = "be9e300c1dafd7c11c5ad128f98160aeadac9014492c00c236c3899dd99edff8345ddd3745ec24d43acc97a0481922e3d8201c40d1578c216d0943e598834412"

RPROVIDES:${PN} += "python311-libfsntfs python311-libfsntfs(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libfguid.so.1()(64bit) libfguid.so.1(V_20220113)(64bit) libfsntfs.so.1()(64bit) libfsntfs.so.1(V_20230427)(64bit) python(abi)"

inherit rpm
