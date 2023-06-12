SUMMARY = "Devel files for python311-PyQt6-NetworkAuth"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python311-PyQt6-NetworkAuth"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python311-PyQt6-NetworkAuth-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "ba508491c7c56f7fbfbc738fd5ff44e34d40019ad8e4c820a250b2d1c0e546e33bec712e23f2fad62c65a298cedc3683572622eee8d777558d13053faf50e3a0"

RPROVIDES:${PN} += "python311-PyQt6-NetworkAuth-devel \
python311-PyQt6-NetworkAuth-devel(aarch-64)"
RDEPENDS:${PN} += "python311-PyQt6-devel"

inherit rpm
