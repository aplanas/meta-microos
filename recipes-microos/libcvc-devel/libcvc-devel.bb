SUMMARY = "LibCVC API -- Development Files"
DESCRIPTION = "Utility library for volume control of pulseaudio from gobject-based \
Cinnamon modules/applications. \
 \
This package contains development files for libcvc."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "5.6.2"

RPM_NAME = "libcvc-devel-5.6.2-1.1.aarch64.rpm"
RPM_HASH = "1d2b91c2bff8a67f3cddb139c4419e2d78947648cd92850ee737032d9a00e6a57f73b5c83fb90dc9899c88728b5da5046d130d124ddd02da4a8690bfb7c447dc"

RPROVIDES:${PN} += "libcvc-devel libcvc-devel(aarch-64) pkgconfig(cvc)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcvc0 pkgconfig pkgconfig(gio-2.0) pkgconfig(gobject-2.0) pkgconfig(libpulse) pkgconfig(libpulse-mainloop-glib) typelib-1_0-Cvc-1_0"

inherit rpm
