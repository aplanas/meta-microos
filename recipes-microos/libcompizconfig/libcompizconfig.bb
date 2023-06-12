SUMMARY = "CompizConfig plugin required for CCSM"
DESCRIPTION = "CompizConfig plugin required for compizconfig-settings-manager."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "libcompizconfig-0.8.18-2.11.aarch64.rpm"
RPM_HASH = "39e31fcabebdff9332c1b79dc2e901fbcbd87af921bb025a8f7952f6cafc0a6b238c2fde815404143f0018cf4180a95a64f67b5ff67515572149f3f01c0c1599"

RPROVIDES:${PN} += "config(libcompizconfig) \
libccp.so()(64bit) \
libcompizconfig \
libcompizconfig(aarch-64) \
libcompizconfig.so.0()(64bit) \
libini.so()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
compiz \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libprotobuf-3.21.12.so()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
