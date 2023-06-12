SUMMARY = "Nomad Jukebox API"
DESCRIPTION = "Nomad Jukebox API"
LICENSE = "BSD-3-Clause"

PV = "2.2.7"

RPM_NAME = "libnjb-devel-2.2.7-111.12.aarch64.rpm"
RPM_HASH = "8a7d4fc64b48f57b9267066a79e11ab66c0924804d871350d3404630b9015af732a55ba875e792d1d3442ae29397ee40bed28b560b250b4c1bd33d33185a9ee3"

RPROVIDES:${PN} += "libnjb-devel \
libnjb-devel(aarch-64) \
pkgconfig(libnjb)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnjb \
libusb-devel"

inherit rpm
