SUMMARY = "Xwayland Xserver"
DESCRIPTION = "This package contains the Xserver running on the Wayland Display Server."
LICENSE = "MIT"

PV = "23.1.1"

RPM_NAME = "xwayland-23.1.1-1.1.aarch64.rpm"
RPM_HASH = "82e49f49d3f999a347283b27a5d367586b932cb8bdc00e00eb399bb959bdba73e16b2114fad556c8b47eba4b309feace496defe9e771fff6806e4c7d59d85f40"

RPROVIDES:${PN} += "application() \
application(org.freedesktop.Xwayland.desktop) \
xorg-x11-server-wayland \
xwayland \
xwayland(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libXau.so.6()(64bit) \
libXdmcp.so.6()(64bit) \
libXfont2.so.2()(64bit) \
libbsd.so.0()(64bit) \
libbsd.so.0(LIBBSD_0.0)(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libdrm.so.2()(64bit) \
libepoxy.so.0()(64bit) \
libgbm.so.1()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libpixman-1-0 \
libpixman-1.so.0()(64bit) \
libtirpc.so.3()(64bit) \
libtirpc.so.3(TIRPC_0.3.0)(64bit) \
libwayland-client.so.0()(64bit) \
libxcvt.so.0()(64bit) \
libxshmfence.so.1()(64bit) \
pkgconfig \
xkbcomp \
xkeyboard-config"

inherit rpm
