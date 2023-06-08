SUMMARY = "Development package for the pulseaudio library"
DESCRIPTION = "pulseaudio is a networked sound server for Linux and other Unix like \
operating systems and Microsoft Windows. It is intended to be an \
improved drop-in replacement for the Enlightened Sound Daemon (ESOUND). \
 \
This package contains the files needed to compile programs that use the \
pulseaudio library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "16.1"

RPM_NAME = "libpulse-devel-16.1-3.1.aarch64.rpm"
RPM_HASH = "491a395a88628f80e2619bc9541b0cc4a2510292d04e7293162275e2c9a3caf64ce19e5cccd5eec30e8bf314acb1a1369c7ca307b00c06cee5e8c92ace69f1f9"

RPROVIDES:${PN} += "libpulse-devel libpulse-devel(aarch-64) pkgconfig(libpulse) pkgconfig(libpulse-mainloop-glib) pkgconfig(libpulse-simple) pulseaudio-devel"
RDEPENDS:${PN} += "/usr/bin/pkg-config libpulse-mainloop-glib0 libpulse0 pkgconfig pkgconfig(glib-2.0) pkgconfig(libpulse)"

inherit rpm
