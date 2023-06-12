SUMMARY = "Pipe connecting action puzzle game"
DESCRIPTION = "You get a limited number of pipes on each level and need to combine \
them such that water from the house at the top of the screen can flow \
to the storage tank at the bottom. Points will be awarded per each \
pipe segment through which water flows, and the goal of the game is \
to reach a high score. Some of the levels also have obstacles where \
pipes cannot be placed. The game is playable with joystick/joypad as \
well."
LICENSE = "GPL-2.0+"

PV = "1.10_svn23"

RPM_NAME = "vodovod-1.10_svn23-3.24.aarch64.rpm"
RPM_HASH = "4ff6cd7b246c1b374540dd5f5710233ff1eab96ee42750c3be818707d40b32a3e340d8e2b831ae15f0ce7d556b49ecf93dc867f266ae84e6e1f7dcb74916f222"

RPROVIDES:${PN} += "application() \
application(vodovod.desktop) \
vodovod \
vodovod(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL-1.2.so.0()(64bit) \
libSDL_image-1.2.so.0()(64bit) \
libSDL_mixer-1.2.so.0()(64bit) \
libSDL_ttf-2.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
