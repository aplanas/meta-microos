SUMMARY = "MATE Weather development files"
DESCRIPTION = "libmateweather is a library to access weather information from \
online services for numerous locations."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.26.0"

RPM_NAME = "libmateweather-devel-1.26.0-1.9.aarch64.rpm"
RPM_HASH = "40c52f09d8474a19c27987a85e1337f1ae935a7f5b17b339f9f53bd89e3284d16e94387cbb72523fb4d9c14f78d3a5d9ffe9d4b5e44e1e8290beacf22d4b5128"

RPROVIDES:${PN} += "libmateweather-devel libmateweather-devel(aarch-64) pkgconfig(mateweather)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libmateweather1 mateweather-common pkgconfig(gdk-pixbuf-2.0) pkgconfig(gio-2.0) pkgconfig(glib-2.0) pkgconfig(gobject-2.0) pkgconfig(gtk+-3.0) pkgconfig(libsoup-2.4) pkgconfig(libxml-2.0)"

inherit rpm
