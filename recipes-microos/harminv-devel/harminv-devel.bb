SUMMARY = "Libraries and header files for the harminv library"
DESCRIPTION = "Harminv is library to solve the problem of harmonic inversion — given \
a discrete-time, finite-length signal that consists of a sum of \
finitely-many sinusoids (possibly exponentially decaying) in a given \
bandwidth, it determines the frequencies, decay constants, amplitudes, \
and phases of those sinusoids. \
 \
This package contains libraries and header files for developing \
applications that use harminv."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "harminv-devel-1.4.1-1.18.aarch64.rpm"
RPM_HASH = "214e7cd30fec8c1f98d2e25f072b8ac4d21a775d2afa7f79211af41b8580a85827c2d62db8104f3df2f780614dced51b30d069d1aa5dd04c35bbc53e9d185cd2"

RPROVIDES:${PN} += "harminv-devel \
harminv-devel(aarch-64) \
pkgconfig(harminv)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libharminv3"

inherit rpm
