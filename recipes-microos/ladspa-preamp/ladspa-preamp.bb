SUMMARY = "LADSPA preamp plugin"
DESCRIPTION = "This package provides a LADSPA (Linux Audio Developer's Simple Plug-in API) \
plugin emulating a vlve-based preamplifier."
LICENSE = "GPL-2.0+"

PV = "2"

RPM_NAME = "ladspa-preamp-2-4.22.aarch64.rpm"
RPM_HASH = "1d8c5d5c354fce43b09bcb4a2f10fce1ecbbfc1c70af6f04a7af2737bae196e7e2195b64a205b4f1a08ca7c166ed049a95dbbdef6a03f04f7e7c4d64196c8cb9"

RPROVIDES:${PN} += "ladspa-preamp \
ladspa-preamp(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
