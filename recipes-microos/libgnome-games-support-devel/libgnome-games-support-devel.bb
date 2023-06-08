SUMMARY = "Development files for the GNOME Internal games library"
DESCRIPTION = "libgnome-games-support is a small library intended for internal use by \
GNOME Games, but it may be used by others. The API will only break \
with the major version number. The ABI is unstable."
LICENSE = "LGPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "libgnome-games-support-devel-2.0.0-1.7.aarch64.rpm"
RPM_HASH = "4e2a9240372c9c9522028bb2b1463a31baf36382b102f299ca0171f87b8b10f23d1b1e0ff6cafdc2105b893ab5eecb930f79883941cbd66498f8e55d3131258a"

RPROVIDES:${PN} += "libgnome-games-support-devel libgnome-games-support-devel(aarch-64) pkgconfig(libgnome-games-support-2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libgnome-games-support-2-4 pkgconfig(gee-0.8) pkgconfig(gio-2.0) pkgconfig(glib-2.0) pkgconfig(gtk4)"

inherit rpm
