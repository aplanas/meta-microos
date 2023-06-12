SUMMARY = "LADSPA CMT plugins"
DESCRIPTION = "This toolkit is a set of musical sound processing and synthesis tools \
presented as a LADSPA (Linux Audio Developer's Simple Plug-in API) \
plugin library for CMT (Computer Music Toolkit). \
See the /usr/share/doc/packages/ladspa-cmt directory for documentation."
LICENSE = "GPL-2.0-or-later"

PV = "1.18"

RPM_NAME = "ladspa-cmt-1.18-1.8.aarch64.rpm"
RPM_HASH = "94ecfe11f30e42c5084581b1ded9dc48ef80d619268fbd43630cd522819b70abacb3c3b1d78cf22cb058619bf9e560239282bb3bfa20d4801d7d6d6920b0dfe6"

RPROVIDES:${PN} += "ladspa-cmt \
ladspa-cmt(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
