SUMMARY = "Library and tools to access the NTFS filesystem"
DESCRIPTION = "Library and tools to access the New Technology File System (NTFS). \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230427"

RPM_NAME = "python39-libfsntfs-20230427-1.1.aarch64.rpm"
RPM_HASH = "685bf3e0f8384093cd280111d29d6d4fe8e1837eb4b8cb371e0040d57c31b78596e4c580376e76fec45927954a8b89bda9bec0bdc06d7c0d696ecd7c4d051356"

RPROVIDES:${PN} += "python39-libfsntfs \
python39-libfsntfs(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libfguid.so.1()(64bit) \
libfguid.so.1(V_20220113)(64bit) \
libfsntfs.so.1()(64bit) \
libfsntfs.so.1(V_20230427)(64bit) \
python(abi)"

inherit rpm
