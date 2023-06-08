SUMMARY = "The GNOME Desktop API Library"
DESCRIPTION = "The libgnome-desktop library provides API shared by several applications \
on the desktop, but that cannot live in the platform for various \
reasons."
LICENSE = "LGPL-2.1-or-later"

PV = "44.0"

RPM_NAME = "libgnome-desktop-4-2-44.0-1.1.aarch64.rpm"
RPM_HASH = "c5c8da8a6a5b02b43fdad09a69aa4cf66499d4d0ed655831c670641fb721ed38bb90bdc69d080dfb9ed1f076d597ae885eb1062f6e8c0e59ae3cc60eaa323238"

RPROVIDES:${PN} += "gnome-desktop libgnome-bg-4.so.2()(64bit) libgnome-desktop-4-2 libgnome-desktop-4-2(aarch-64) libgnome-desktop-4.so.2()(64bit) libgnome-rr-4.so.2()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig bubblewrap gsettings-desktop-schemas ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libcairo.so.2()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgnome-desktop-3_0-common libgobject-2.0.so.0()(64bit) libgtk-4.so.1()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libseccomp.so.2()(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) libudev.so.1(LIBUDEV_196)(64bit) libxkbregistry.so.0()(64bit) libxkbregistry.so.0(V_1.0.0)(64bit)"

inherit rpm
