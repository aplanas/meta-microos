SUMMARY = "Mutter based compositor for kiosks"
DESCRIPTION = "Kiosk provides a desktop enviroment suitable for fixed purpose, or single \
application deployments like wall displays and point-of-sale systems."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-kiosk-44.0-1.1.aarch64.rpm"
RPM_HASH = "0182271e960587aa20b1982971e7813e42061c6206086a7471d761ce6c11901edaee0a1f7089b84ac0e9d0c306ba2c943983e09abdac2e9dd219acc5f795903a"

RPROVIDES:${PN} += "application() \
application(org.gnome.Kiosk.Script.desktop) \
application(org.gnome.Kiosk.desktop) \
gnome-kiosk \
gnome-kiosk(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/sh \
gnome-session \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGLESv2.so.2()(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnome-desktop-3.so.20()(64bit) \
libgobject-2.0.so.0()(64bit) \
libibus-1.0.so.5()(64bit) \
libmutter-12.so.0()(64bit) \
libmutter-clutter-12.so.0()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit)"

inherit rpm
