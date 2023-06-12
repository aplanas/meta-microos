SUMMARY = "Documentation for qt6-charts in QCH format"
DESCRIPTION = "This package contains documentation for qt6-charts in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-charts-docs-qch-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "1c2a588025cc0f5d3ec054dfd6cab16b8a79134a079092881c468eb81be68dc682a2335c4f0757e9233760c13ed790520c3c5107d3f918dab1c770ce2de35a72"

RPROVIDES:${PN} += "qt6-charts-docs-qch \
qt6-charts-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
