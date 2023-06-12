SUMMARY = "Development package for the libdrumstick library"
DESCRIPTION = "This package contains the files needed to compile programs that use the \
libdrumstick libraries."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "libdrumstick-devel-2.7.2-1.3.aarch64.rpm"
RPM_HASH = "e2b991bcca5e2cb33ee20569a70d783413b52c41fb6578d78eb6c0c28b0b6d6627b95f50942c20ca43b38e02e9e7c411a2e4dfdc6ab1e6fb0b4a8b1c65deb2e8"

RPROVIDES:${PN} += "cmake(drumstick) \
cmake(drumstick-alsa) \
cmake(drumstick-file) \
cmake(drumstick-rt) \
cmake(drumstick-widgets) \
libdrumstick-devel \
libdrumstick-devel(aarch-64) \
libdrumstick-vpiano-plugin.so()(64bit) \
pkgconfig(drumstick-alsa) \
pkgconfig(drumstick-file) \
pkgconfig(drumstick-rt) \
pkgconfig(drumstick-widgets)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
alsa-devel \
cmake(Qt5Core) \
glibc-devel \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdrumstick-alsa2 \
libdrumstick-file2 \
libdrumstick-rt2 \
libdrumstick-widgets.so.2()(64bit) \
libdrumstick-widgets2 \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++-devel \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
