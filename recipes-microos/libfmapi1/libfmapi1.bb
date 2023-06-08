SUMMARY = "Library for MAPI data types"
DESCRIPTION = "A library for MAPI data types. \
 \
libfmapi is part of the libyal library collection"
LICENSE = "LGPL-3.0-or-later"

PV = "20230408"

RPM_NAME = "libfmapi1-20230408-1.1.aarch64.rpm"
RPM_HASH = "f98386f5b4082a7a6e393d49026a42c00815f6890d057305250d69ac7e6ec50a43230e9d3e4589f6da4e9f8b58526ed438622f8289dfc6677654d11f375e9834"

RPROVIDES:${PN} += "libfmapi.so.1()(64bit) libfmapi.so.1(V_20230408)(64bit) libfmapi1 libfmapi1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libuna.so.1()(64bit) libuna.so.1(V_20220611)(64bit)"

inherit rpm
