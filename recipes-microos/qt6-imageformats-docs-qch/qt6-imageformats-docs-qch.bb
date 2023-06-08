SUMMARY = "Documentation for qt6-imageformats in QCH format"
DESCRIPTION = "This package contains documentation for qt6-imageformats in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-imageformats-docs-qch-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "215cfe56cacc7692e41e78f33563941901f789b8674ed50a35599694be1cdd8fdfdf62a9380ceaf8efe690e10acefc4d0d19d41d848f30f52b8f8f5bcabbd103"

RPROVIDES:${PN} += "qt6-imageformats-docs-qch qt6-imageformats-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
