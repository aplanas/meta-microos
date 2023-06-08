SUMMARY = "Documentation for qt6-quick3d in QCH format"
DESCRIPTION = "This package contains documentation for qt6-quick3d in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-quick3d-docs-qch-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "3250829b06339f711353df4a5a532e23a270b15e0fd3a0ae74317bd771473cad14345357793ec40d260d0a6ae184b964a6c1ac66849346313c76cbecbe048661"

RPROVIDES:${PN} += "qt6-quick3d-docs-qch qt6-quick3d-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
