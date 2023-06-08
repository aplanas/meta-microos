SUMMARY = "Documentation for qt6-charts in QCH format"
DESCRIPTION = "This package contains documentation for qt6-charts in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-charts-docs-qch-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "c75692d4e3a7e11c4fdb2073333dc907f850c0f8c5109a1db5cc71582aebeb11a203bcf344ef4cef5c36f5655dc122caea8d73b74c6c6be82c34fd9008229e51"

RPROVIDES:${PN} += "qt6-charts-docs-qch qt6-charts-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
