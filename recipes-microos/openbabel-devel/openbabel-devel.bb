SUMMARY = "Development files for Open Babel"
DESCRIPTION = "Open Babel is a chemical toolbox understanding many formats of \
chemical data. It allows to search, convert, analyze, or store data \
from molecular modeling, chemistry, solid-state materials, \
biochemistry, or related areas."
LICENSE = "GPL-2.0-only"

PV = "3.1.1"

RPM_NAME = "openbabel-devel-3.1.1-1.4.aarch64.rpm"
RPM_HASH = "024c018cbda62151bf4dd7a9bf98e4401603e1705f081c97ae64c25cec2c71a4b9abfcf55c3fe843cff202a75f31b31e5beb2f03d392f9db88e42dac48f7b47d"

RPROVIDES:${PN} += "cmake(OpenBabel3) libopenbabel-devel openbabel-devel openbabel-devel(aarch-64) pkgconfig(openbabel-3)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libopenbabel7 pkgconfig(zlib)"

inherit rpm
