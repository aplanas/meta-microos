SUMMARY = "Development files for the Pixel Manipulation library"
DESCRIPTION = "Pixman is a pixel manipulation library for X and cairo."
LICENSE = "MIT"

PV = "0.42.2"

RPM_NAME = "libpixman-1-0-devel-0.42.2-1.3.aarch64.rpm"
RPM_HASH = "9129a9b1f09bff19fc5816d3ea1dbc2ac123a5e96430a8ee8cf7755bb5af5388f22d2ecce94b4c5a820741b573b9cc1120347f1ca81397ed25132d285ef0e1aa"

RPROVIDES:${PN} += "libpixman-1-0-devel libpixman-1-0-devel(aarch-64) pkgconfig(pixman-1)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libpixman-1-0"

inherit rpm
