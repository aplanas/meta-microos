SUMMARY = "MATE session settings daemon development files"
DESCRIPTION = "This package contains the daemon which is responsible for setting \
the various parameters of a MATE session and the applications that \
run under it."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.26.1"

RPM_NAME = "mate-settings-daemon-devel-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "81ee746550a82e9850e95f4042f1bd6f241a4050359777017f46c3beaaaa267c40128517d4189707a1f41b1bc001d6e57648372d63221c102c9072a5c3266258"

RPROVIDES:${PN} += "mate-settings-daemon-devel mate-settings-daemon-devel(aarch-64) pkgconfig(mate-settings-daemon)"
RDEPENDS:${PN} += "/usr/bin/pkg-config mate-settings-daemon pkgconfig(dbus-1) pkgconfig(dbus-glib-1) pkgconfig(glib-2.0)"

inherit rpm
