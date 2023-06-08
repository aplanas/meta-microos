SUMMARY = "A lightweight GTK+ clipboard manager"
DESCRIPTION = "Parcellite is a stripped down, basic-features-only clipboard manager with a \
small memory footprint for those who like simplicity. \
 \
In GNOME and Xfce the clipboard manager will be started automatically. For \
other desktops or window managers you should also install a panel with a \
system tray or notification area if you want to use this package."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.1"

RPM_NAME = "parcellite-1.2.1-2.9.aarch64.rpm"
RPM_HASH = "30b12128b0da8be47d69caa7912180953c3dcbdd0f15d72121807337b4025890841ad9ae63f24f0fa3507c6e5c4b2aab19a501e86015160e3f1d696bf320314b"

RPROVIDES:${PN} += "application() application(parcellite.desktop) config(parcellite) parcellite parcellite(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgdk-x11-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit) libpango-1.0.so.0()(64bit) xdotool"

inherit rpm
