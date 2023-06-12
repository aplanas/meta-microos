SUMMARY = "Configuration tool for Tux Paint"
DESCRIPTION = "Tux Paint has a rich set of configuration options, controllable via \
command-line options or configuration files. This configuration tool \
provides a point-and-click interface for administrators to tailor \
Tux Paint to suit the needs of their users."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.18"

RPM_NAME = "tuxpaint-config-0.0.18-1.7.aarch64.rpm"
RPM_HASH = "d40d41f0721c5367cbf0db151a9933be32c557cc8163cf5e44c871e273dc11c1ec5463a0674c0c04c752537b14f6f07963560e2ec8104ad5c73c635569b99d56"

RPROVIDES:${PN} += "application() \
application(tuxpaint-config.desktop) \
tuxpaint-config \
tuxpaint-config(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfltk.so.1.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libpaper.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libunibreak.so.5()(64bit) \
tuxpaint-config-lang"

inherit rpm
