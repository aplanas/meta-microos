SUMMARY = "Computer sound synthesis and composition library"
DESCRIPTION = "Library for csound use. \
Csound is a software synthesis program supporting oscillators and \
filters."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.18.1"

RPM_NAME = "libcsnd6-6_0-6.18.1-3.1.aarch64.rpm"
RPM_HASH = "87363b6a3588db7e4e42f1d31ecbff71379e344335be07f97e38fd051a6929089de0bba50e8297f7a29950391c783b28999aed4aa88dc0d049ec8111bd3bc67a"

RPROVIDES:${PN} += "libcsnd6-6_0 \
libcsnd6-6_0(aarch-64) \
libcsnd6.so.6.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libcsound64.so.6.0()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libsndfile.so.1()(64bit) \
libsndfile.so.1(libsndfile.so.1.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
