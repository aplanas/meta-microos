SUMMARY = "wxWidgets SDL Plugin"
DESCRIPTION = "SDL Plugin for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "wxWidgets-3_0-plugin-sound_sdlu-3_0-3.0.5.1-3.1.aarch64.rpm"
RPM_HASH = "5b05e4019f91dd452cd4badc8a6d36ba0857f46e11497e653e971e4d8259cb1da29c2d126d38ed821b314115e7326ffc885866bf77fb2f88e88edb18cb315c3c"

RPROVIDES:${PN} += "wxWidgets-3_0-plugin-sound_sdlu-3_0 wxWidgets-3_0-plugin-sound_sdlu-3_0(aarch-64)"
RDEPENDS:${PN} += "libSDL2-2.0.so.0()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
