SUMMARY = "Devel files for python39-PyQt6-3D"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python39-PyQt6-3D"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python39-PyQt6-3D-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "b8e16517c898142845537b162c23418a0629a093c28e6304eb5dec9e3eefb682c4cf1630565bd348e2e6a7ed235074aff74e530a51d26c7ff4457e16d6005750"

RPROVIDES:${PN} += "python39-PyQt6-3D-devel python39-PyQt6-3D-devel(aarch-64)"
RDEPENDS:${PN} += "python39-PyQt6-devel"

inherit rpm
