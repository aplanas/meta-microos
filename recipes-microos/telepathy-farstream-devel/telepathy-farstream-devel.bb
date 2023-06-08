SUMMARY = "Development files for the Telepathy Call channel handling library"
DESCRIPTION = "Telepathy Farstream is a Telepathy client library that uses Farsight2 \
to handle Call channels."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.2"

RPM_NAME = "telepathy-farstream-devel-0.6.2-2.23.aarch64.rpm"
RPM_HASH = "79be30da56e52c2f1caff4f4b97e56703dcd2d06fade9b8ccbc3f01b9a3b70e8bd536f9577c1f8f6d22f2038da014e6160af75028e512f918424a99f2dc5a770"

RPROVIDES:${PN} += "pkgconfig(telepathy-farstream) telepathy-farstream-devel telepathy-farstream-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libtelepathy-farstream3 pkgconfig(dbus-glib-1) pkgconfig(farstream-0.2) pkgconfig(glib-2.0) pkgconfig(gobject-2.0) pkgconfig(gstreamer-1.0) pkgconfig(telepathy-glib) typelib-1_0-TelepathyFarstream-0_6"

inherit rpm
