SUMMARY = "Documentation for qt6-3d in QCH format"
DESCRIPTION = "This package contains documentation for qt6-3d in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-3d-docs-qch-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "84461f47d288323a144ce39a21c36299f942433ae675dfd3d367d133cb369e9bc98c90c77dbaf7f6d61bd68b39bd1c6317effe2bfa5586569e7c2e1b063b26d3"

RPROVIDES:${PN} += "qt6-3d-docs-qch qt6-3d-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
