SUMMARY = "MATE window manager shared libraries"
DESCRIPTION = "Marco is a small window manager, using GTK+ to do everything. It is \
developed mainly for the MATE Desktop."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "libmarco-private2-1.26.1-1.3.aarch64.rpm"
RPM_HASH = "a309dfd666e7171446a90785b48225497d888436ff515a4c5b67086a8032a0f04ffaa6d6e04164340acbd21a85646fb0d9ca9f0ceea303462cc29875b94b2d60"

RPROVIDES:${PN} += "libmarco-private.so.2()(64bit) libmarco-private2 libmarco-private2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libICE.so.6()(64bit) libSM.so.6()(64bit) libX11.so.6()(64bit) libXRes.so.1()(64bit) libXcomposite.so.1()(64bit) libXcursor.so.1()(64bit) libXdamage.so.1()(64bit) libXext.so.6()(64bit) libXfixes.so.3()(64bit) libXinerama.so.1()(64bit) libXrandr.so.2()(64bit) libXrender.so.1()(64bit) libatk-1.0.so.0()(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libcanberra-gtk3.so.0()(64bit) libcanberra.so.0()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libgtop-2.0.so.11()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libstartup-notification-1.so.0()(64bit)"

inherit rpm
