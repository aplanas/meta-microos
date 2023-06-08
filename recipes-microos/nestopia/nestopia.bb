SUMMARY = "Nintendo Entertainment System/Famicom emulator"
DESCRIPTION = "Nestopia is a cycle-accurate NES/Famicom emulator. It has a high compatibility \
rate and support for many peripherals and input devices."
LICENSE = "GPL-2.0-or-later"

PV = "1.52.0"

RPM_NAME = "nestopia-1.52.0-1.3.aarch64.rpm"
RPM_HASH = "c452fd3555577ba6ba7f5b90ceabab5a7cdaa5edfd63e676f9644a0067132a262b51f11c8e16b070b939304dfc2a690cd3cadff2e46a11d6d1d0d28d930d8d14"

RPROVIDES:${PN} += "application() application(nestopia.desktop) nestopia nestopia(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libSDL2-2.0.so.0()(64bit) libarchive.so.13()(64bit) libc.so.6(GLIBC_2.34)(64bit) libfltk.so.1.3()(64bit) libfltk_gl.so.1.3()(64bit) libfltk_images.so.1.3()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libz.so.1()(64bit)"

inherit rpm
