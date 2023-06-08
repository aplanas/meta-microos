SUMMARY = "Additional Xservers Xephyr, Xnest)"
DESCRIPTION = "This package contains additional Xservers (Xephyr, Xnest)."
LICENSE = "MIT"

PV = "21.1.8"

RPM_NAME = "xorg-x11-server-extra-21.1.8-1.1.aarch64.rpm"
RPM_HASH = "6105d7af57ef3a9afd481061bcf59e455b0cff1a6f78b2b594729895ea4ad78edb0158b98ded38c49e58819c8eec055e6f37405f68b4bc6e48880fd0d2125b2e"

RPROVIDES:${PN} += "xorg-x11-Xnest xorg-x11-server-extra xorg-x11-server-extra(aarch-64)"
RDEPENDS:${PN} += "Mesa ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libX11-xcb.so.1()(64bit) libX11.so.6()(64bit) libXau.so.6()(64bit) libXdmcp.so.6()(64bit) libXext.so.6()(64bit) libXfont2.so.2()(64bit) libc.so.6(GLIBC_2.36)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libepoxy.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libpixman-1.so.0()(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) libxcb-icccm.so.4()(64bit) libxcb-image.so.0()(64bit) libxcb-keysyms.so.1()(64bit) libxcb-randr.so.0()(64bit) libxcb-render-util.so.0()(64bit) libxcb-render.so.0()(64bit) libxcb-shape.so.0()(64bit) libxcb-shm.so.0()(64bit) libxcb-util.so.1()(64bit) libxcb-xkb.so.1()(64bit) libxcb-xv.so.0()(64bit) libxcb.so.1()(64bit) libxshmfence.so.1()(64bit) xkbcomp xkeyboard-config"

inherit rpm
