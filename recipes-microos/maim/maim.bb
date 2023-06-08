SUMMARY = "Flexible screenshotting utility"
DESCRIPTION = "maim (Make Image) is a utility that takes screenshots of the desktop \
using EGL. It is meant to overcome shortcomings of the 'scrot' \
utility and performs better in several ways."
LICENSE = "GPL-3.0-or-later"

PV = "5.7.4"

RPM_NAME = "maim-5.7.4-1.13.aarch64.rpm"
RPM_HASH = "55c0483d352e770f9f06f0b5b816e1ce34ede82178e25d2b0b0fa7d2fc4d42ed30871610fe6c22c68899be9ca064db0bf93d54a76ba3a73b4e385eb20c14fe34"

RPROVIDES:${PN} += "maim maim(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXcomposite.so.1()(64bit) libXext.so.6()(64bit) libXfixes.so.3()(64bit) libXrandr.so.2()(64bit) libXrender.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libicuuc.so.72()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libslopy.so.7.6()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libwebp.so.7()(64bit)"

inherit rpm
