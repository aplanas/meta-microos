SUMMARY = "Development package for libkomparediff2"
DESCRIPTION = "Development package for libkomparediff2."
LICENSE = "(GPL-2.0-or-later & LGPL-2.0-or-later) & BSD-2-Clause"

PV = "23.04.0"

RPM_NAME = "libkomparediff2-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "a61c944db046fc1cc1b2ed9112f1cf8d55871c93f97ad9df07dac1226c330bce53ca817ee8a7dbac4bc516c8a25d1807fe63be74c584a9c6b4ce7bb57724f08b"

RPROVIDES:${PN} += "cmake(LibKompareDiff2) libkomparediff2-devel libkomparediff2-devel(aarch-64) libkomparediff2-kf5-devel"
RDEPENDS:${PN} += "libkomparediff2-5"

inherit rpm
