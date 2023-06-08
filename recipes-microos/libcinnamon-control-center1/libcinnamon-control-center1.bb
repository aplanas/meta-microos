SUMMARY = "Shared libraries for the Cinnamon configuration utilities"
DESCRIPTION = "This package provides shared libraries used by Cinnamon control \
centre applets."
LICENSE = "GPL-2.0-only & GPL-3.0-or-later & MIT"

PV = "5.6.1"

RPM_NAME = "libcinnamon-control-center1-5.6.1-1.3.aarch64.rpm"
RPM_HASH = "371324928fa2fef8ed8d577c598c4059664badd98ccf7035d98a24d0ed383e22c9623c9cb4fd3e070b529a78d0f51cab0da7dc9cf1f804b54d2cf95fe3a56b31"

RPROVIDES:${PN} += "libcinnamon-control-center.so.1()(64bit) libcinnamon-control-center1 libcinnamon-control-center1(aarch-64) libcolor.so()(64bit) libdisplay.so()(64bit) libnetwork.so()(64bit) libonline-accounts.so()(64bit) libregion.so()(64bit) libwacom-properties.so()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXi.so.6()(64bit) libatk-1.0.so.0()(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libcinnamon-desktop.so.4()(64bit) libcolord.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgnomekbd.so.8()(64bit) libgnomekbdui.so.8()(64bit) libgoa-1.0.so.0()(64bit) libgoa-backend-1.0.so.1()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libgudev-1.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmm-glib.so.0()(64bit) libnm.so.0()(64bit) libnm.so.0(libnm_1_0_0)(64bit) libnm.so.0(libnm_1_2_0)(64bit) libnma.so.0()(64bit) libnma.so.0(libnma_1_2_0)(64bit) libpango-1.0.so.0()(64bit) libpolkit-gobject-1.so.0()(64bit) libupower-glib.so.3()(64bit) libwacom.so.9()(64bit) libwacom.so.9(LIBWACOM_2.0)(64bit) libxklavier.so.16()(64bit)"

inherit rpm
