SUMMARY = "A Minimalistic Text Based Status Bar"
DESCRIPTION = "Xmobar is a minimalistic text based status bar. \
 \
Inspired by the Ion3 status bar, it supports similar features, like dynamic \
color management, output templates, and extensibility through plugins."
LICENSE = "BSD-3-Clause"

PV = "0.46"

RPM_NAME = "xmobar-0.46-2.4.aarch64.rpm"
RPM_HASH = "162c1848fa03ae5d7c36648a3bf4160c1337944750db978761f6dfddcb7865bbbcc253e9ac29bb10fb79705a8fd69cf0f8f62905e3ffa546d069a8b3e9651bfa"

RPROVIDES:${PN} += "xmobar xmobar(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libXft.so.2()(64bit) libXinerama.so.1()(64bit) libXpm.so.4()(64bit) libXrandr.so.2()(64bit) libXrender.so.1()(64bit) libXss.so.1()(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libatomic.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libffi.so.8()(64bit) libffi.so.8(LIBFFI_BASE_8.0)(64bit) libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) libglib-2.0.so.0()(64bit) libgmp.so.10()(64bit) libgobject-2.0.so.0()(64bit) libharfbuzz.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libnuma.so.1()(64bit) libnuma.so.1(libnuma_1.1)(64bit) libnuma.so.1(libnuma_1.2)(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libpng16.so.16()(64bit) libz.so.1()(64bit)"

inherit rpm
