SUMMARY = "Documentation for qt6-qt5compat in QCH format"
DESCRIPTION = "This package contains documentation for qt6-qt5compat in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-qt5compat-docs-qch-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "78dc4554524de9b8fa31dde71e752a2c2b684c7089084aa6e88dcc925c813a7beb3e83bc94dbf9e9d7d044c870a7edbaba7b64e5f3d254384ad482d84d94346d"

RPROVIDES:${PN} += "qt6-qt5compat-docs-qch qt6-qt5compat-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
