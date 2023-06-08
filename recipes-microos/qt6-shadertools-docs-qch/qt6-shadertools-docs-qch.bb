SUMMARY = "Documentation for qt6-shadertools in QCH format"
DESCRIPTION = "This package contains documentation for qt6-shadertools in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-shadertools-docs-qch-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "c50419f87b61d4c9aa748d8fb111466645b7a50afaccb1a579538386fd2bfe101641cd50f3b6944a6f24bdf9fcb296cab88c35369b5138b88475ae827e93b757"

RPROVIDES:${PN} += "qt6-shadertools-docs-qch qt6-shadertools-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
