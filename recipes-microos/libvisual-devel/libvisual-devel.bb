SUMMARY = "Headers for the libvisual sound visualization library"
DESCRIPTION = "Libvisual is a library that acts as a middle layer between applications \
that want audio visualisation and audio visualisation plugins. \
 \
This library is used by amaroK for example."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.0"

RPM_NAME = "libvisual-devel-0.4.0-204.3.aarch64.rpm"
RPM_HASH = "9f6f0f89af9f3d988a2f430d8aab2413ad68e230331e8201a03e512da5fbb7bab429d6736e6b50de895a32fb97e3950fd98158131a5893719e740563109517e7"

RPROVIDES:${PN} += "libvisual-devel libvisual-devel(aarch-64) pkgconfig(libvisual-0.4)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel libvisual-0_4-0"

inherit rpm
