SUMMARY = "Documentation for qt6-datavis3d in QCH format"
DESCRIPTION = "This package contains documentation for qt6-datavis3d in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-datavis3d-docs-qch-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "d0f88ac5d155db2684a3815f509b74004c43d517fe94be32614651c7f3a2c85e478897e6881c0747c4109f40474c1170c059b65443f2f0e8c84828b78552220a"

RPROVIDES:${PN} += "qt6-datavis3d-docs-qch qt6-datavis3d-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
