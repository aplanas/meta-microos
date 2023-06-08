SUMMARY = "Development files for libredwg"
DESCRIPTION = "GNU LibreDWG is a C library to handle DWG files. It can replace the \
OpenDWG libraries. DWG is the native file format of AutoCAD. \
 \
This package contains the files required for development with libredwg."
LICENSE = "GPL-3.0-or-later"

PV = "0.12.5"

RPM_NAME = "libredwg-devel-0.12.5-3.4.aarch64.rpm"
RPM_HASH = "f5d091b4e42b5fb5d6cdc3f5b5552a90ee042793a485f008ba689c5053061d84a7b1477890dcf6307d2a62930dde71018a95434a57979b006c642d5558ebb82e"

RPROVIDES:${PN} += "libredwg-devel libredwg-devel(aarch-64) pkgconfig(libredwg)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libredwg0"

inherit rpm
