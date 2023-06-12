SUMMARY = "Documentation for qt6-remoteobjects in QCH format"
DESCRIPTION = "This package contains documentation for qt6-remoteobjects in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-remoteobjects-docs-qch-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "ea27714ab75a176fc9b33cebdd9f19e7f2a107e4053fec80a97311989261066233035aa98ba5f777662226cbb4fea353c50e5b8353b2304429e4e83a825459f9"

RPROVIDES:${PN} += "qt6-remoteobjects-docs-qch qt6-remoteobjects-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
