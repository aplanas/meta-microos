SUMMARY = "wxWidgets SDL Plugin"
DESCRIPTION = "SDL based sound plugin for the wxWidgets cross-platform GUI."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "wxWidgets-3_2-plugin-sound_sdlu-3_2-3.2.2.1-2.1.aarch64.rpm"
RPM_HASH = "fd754f2aea0b1bc89b7bbf604020d463719654421ebd906d0f557f931b7d81cdef07740a0153da5339ee44c24f6213f4ec226c8105b68b61fa2e2a25cfe069fa"

RPROVIDES:${PN} += "wxWidgets-3_2-plugin-sound_sdlu-3_2 wxWidgets-3_2-plugin-sound_sdlu-3_2(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSDL2-2.0.so.0()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
