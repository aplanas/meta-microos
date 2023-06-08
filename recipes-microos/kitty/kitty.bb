SUMMARY = "A GPU-based terminal emulator"
DESCRIPTION = "A terminal emulator that uses OpenGL for rendering. \
Supports terminal features like: graphics, Unicode, \
true-color, OpenType ligatures, mouse protocol, focus tracking, \
bracketed paste and so on, and which can be controlled by scripts."
LICENSE = "GPL-3.0-only"

PV = "0.28.1"

RPM_NAME = "kitty-0.28.1-1.1.aarch64.rpm"
RPM_HASH = "0bb9f54d93b1d09b9fb342c6383ce910c160dc176256ef752a985c495b1a5100a3836ee92d8f5518643a11ef20a16c7779f63bb303aa16165c2afde98ece6561"

RPROVIDES:${PN} += "application() application(kitty-open.desktop) application(kitty.desktop) kitty kitty(aarch-64) mimehandler(application/x-sh) mimehandler(application/x-shellscript) mimehandler(image/*) mimehandler(inode/directory) mimehandler(text/*) mimehandler(x-scheme-handler/kitty) mimehandler(x-scheme-handler/ssh)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11-xcb.so.1()(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libharfbuzz.so.0()(64bit) liblcms2.so.2()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libpython3.10.so.1.0()(64bit) librsync.so.2()(64bit) libwayland-client.so.0()(64bit) libxkbcommon-x11.so.0()(64bit) libxkbcommon-x11.so.0(V_0.5.0)(64bit) libxkbcommon.so.0()(64bit) libxkbcommon.so.0(V_0.5.0)(64bit) libxkbcommon.so.0(V_1.0.0)(64bit) libz.so.1()(64bit)"

inherit rpm
