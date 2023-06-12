SUMMARY = "Solarus game engine shared library"
DESCRIPTION = "This package provides the main shared library of the Solarus game \
engine."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.5"

RPM_NAME = "libsolarus1-1.6.5-2.15.aarch64.rpm"
RPM_HASH = "a9d0d8447088cf4a3f49fd81f9e9fd1f000834c023a7c8fce44c810301a7abd702443424d387dc9c0f5e45e28da9aed9795ac0c3cd6d470d20870fb9c9d6a94c"

RPROVIDES:${PN} += "libsolarus.so.1()(64bit) \
libsolarus1 \
libsolarus1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.10)(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.6)(64bit) \
libSDL2_image-2.0.so.0()(64bit) \
libSDL2_ttf-2.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libluajit-5.1.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmodplug.so.1()(64bit) \
libopenal.so.1()(64bit) \
libphysfs.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libvorbis.so.0()(64bit) \
libvorbisfile.so.3()(64bit)"

inherit rpm
