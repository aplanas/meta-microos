SUMMARY = "Documentation for qt6-location in QCH format"
DESCRIPTION = "This package contains documentation for qt6-location in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-location-docs-qch-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "d40e5deef37fef2f53f3a3b4fb1bc83bbdcfaa2ee0bc463f76b175b8c50ba537f778b9159b89d700ccb6022262e55d79ad34e6274d44c28666c6460adbab6bcd"

RPROVIDES:${PN} += "qt6-location-docs-qch qt6-location-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
