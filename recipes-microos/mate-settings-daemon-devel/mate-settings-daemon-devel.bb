SUMMARY = "MATE session settings daemon development files"
DESCRIPTION = "This package contains the daemon which is responsible for setting \
the various parameters of a MATE session and the applications that \
run under it."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.26.0"

RPM_NAME = "mate-settings-daemon-devel-1.26.0-1.9.aarch64.rpm"
RPM_HASH = "f6c87c0c0e42c906cb707ba0c0f67bf01972df3ececefdc91e4426aafa2481b92b188e182735bed579e5d56be00e3fcab8d919d7913ef17f3e9aa7b9cac1ff00"

RPROVIDES:${PN} += "mate-settings-daemon-devel mate-settings-daemon-devel(aarch-64) pkgconfig(mate-settings-daemon)"
RDEPENDS:${PN} += "/usr/bin/pkg-config mate-settings-daemon pkgconfig(dbus-1) pkgconfig(dbus-glib-1) pkgconfig(glib-2.0)"

inherit rpm
