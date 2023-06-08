SUMMARY = "Library and tools to access the NTFS filesystem"
DESCRIPTION = "Library and tools to access the New Technology File System (NTFS). \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230427"

RPM_NAME = "python310-libfsntfs-20230427-1.1.aarch64.rpm"
RPM_HASH = "1cfbda81b83eabd0d8329be7e0430e5c5e2b0a720444dcaa05e3069643ffb16958b2693d264747aa9e5b286c01c993b626fbdde520987fd6082c9441b868ec50"

RPROVIDES:${PN} += "python3-libfsntfs python310-libfsntfs python310-libfsntfs(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libfguid.so.1()(64bit) libfguid.so.1(V_20220113)(64bit) libfsntfs.so.1()(64bit) libfsntfs.so.1(V_20230427)(64bit) python(abi)"

inherit rpm
