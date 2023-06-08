SUMMARY = "Development files for the GNOME Desktop API library"
DESCRIPTION = "The libgnome-desktop library provides API shared by several applications \
on the desktop, but that cannot live in the platform for various \
reasons."
LICENSE = "LGPL-2.1-or-later"

PV = "44.0"

RPM_NAME = "libgnome-desktop-4-devel-44.0-1.1.aarch64.rpm"
RPM_HASH = "4e56dac7b25c530737352d67fbf3a039591237d7b3b33239fcfd0c53d5e21432d06d395e90d89bb1bb5148c7c16f9c4d2e082eedce3f1373ef41ff278485e0d9"

RPROVIDES:${PN} += "libgnome-desktop-4-devel libgnome-desktop-4-devel(aarch-64) pkgconfig(gnome-bg-4) pkgconfig(gnome-desktop-4) pkgconfig(gnome-rr-4)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libgnome-desktop-4-2 pkgconfig(gdk-pixbuf-2.0) pkgconfig(gio-2.0) pkgconfig(gio-unix-2.0) pkgconfig(glib-2.0) pkgconfig(gnome-desktop-4) pkgconfig(gsettings-desktop-schemas) pkgconfig(gtk4) pkgconfig(iso-codes) pkgconfig(libseccomp) pkgconfig(libsystemd) pkgconfig(libudev) pkgconfig(xkbregistry) pkgconfig(xkeyboard-config) typelib-1_0-GnomeBG-4_0 typelib-1_0-GnomeDesktop-4_0 typelib-1_0-GnomeRR-4_0"

inherit rpm
