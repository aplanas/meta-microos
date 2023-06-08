SUMMARY = "A backend implementation for xdg-desktop-portal"
DESCRIPTION = "A backend implementation for xdg-desktop-portal for the GNOME \
desktop environment."
LICENSE = "LGPL-2.1-or-later"

PV = "44.1"

RPM_NAME = "xdg-desktop-portal-gnome-44.1-1.1.aarch64.rpm"
RPM_HASH = "a7665efc31b406131c6c9c1584bddbc950915e810c95ed685e7101231fa17e374de296a01b59087556a20ebe09720c1c154aff1c7aa9c684fc2c99e77acde443"

RPROVIDES:${PN} += "application() application(xdg-desktop-portal-gnome.desktop) xdg-desktop-portal-gnome xdg-desktop-portal-gnome(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libadwaita-1.so.0()(64bit) libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libfontconfig.so.1()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgnome-bg-4.so.2()(64bit) libgnome-desktop-4.so.2()(64bit) libgobject-2.0.so.0()(64bit) libgtk-4.so.1()(64bit) libwayland-client.so.0()(64bit) xdg-desktop-portal"

inherit rpm
