SUMMARY = "MATE Desktop keyboard configuration development files"
DESCRIPTION = "libmatemixer is a mixer library for MATE desktop. \
 \
It provides an abstract API allowing access to mixer functionality \
available in the PulseAudio, ALSA and OSS sound systems."
LICENSE = "LGPL-2.1-or-later"

PV = "1.26.0"

RPM_NAME = "libmatemixer-devel-1.26.0-1.8.aarch64.rpm"
RPM_HASH = "3fc35e4580682c1a70290a05ba369c73c1ecfd5d8d4f2bec266c923e0acdf1851630c2471338e99ae8cc97be012433e8222e6af273cdf75029e45dc2092f9bee"

RPROVIDES:${PN} += "libmatemixer-devel libmatemixer-devel(aarch-64) pkgconfig(libmatemixer)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libmatemixer0 pkgconfig(glib-2.0) pkgconfig(gmodule-2.0) pkgconfig(gobject-2.0)"

inherit rpm
