SUMMARY = "Documentation for qt6-serialbus in QCH format"
DESCRIPTION = "This package contains documentation for qt6-serialbus in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-serialbus-docs-qch-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "94d166897268e1821eaa139fc6a2cff9e0c82957e01786f0f6f7e286af17b211819a28dd7e38c36f7227fdfe4611a2b229d6cadb90dc4152530ce52ec1a0f11a"

RPROVIDES:${PN} += "qt6-serialbus-docs-qch qt6-serialbus-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
