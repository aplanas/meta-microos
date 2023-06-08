SUMMARY = "Library for binary signature scanning"
DESCRIPTION = "libsigscan is a library for binary signature scanning \
 \
libsigscan is part of the libyal family of libraries"
LICENSE = "LGPL-3.0-or-later"

PV = "20230109"

RPM_NAME = "python311-libsigscan-20230109-1.4.aarch64.rpm"
RPM_HASH = "ba077d21015d56744363e4cc938f190852870e9eaf6be9b488fabc72da5e337bc6d0d54ac2cda19ec6c46280a1c1ee5a8c6a616d8f939018108e4c43fe44dbe9"

RPROVIDES:${PN} += "python311-libsigscan python311-libsigscan(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libsigscan.so.1()(64bit) libsigscan.so.1(V_20230109)(64bit) python(abi)"

inherit rpm
