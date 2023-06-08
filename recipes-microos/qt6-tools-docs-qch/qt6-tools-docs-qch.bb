SUMMARY = "Documentation for qt6-tools in QCH format"
DESCRIPTION = "This package contains documentation for qt6-tools in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-tools-docs-qch-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "8d06c4e50f6b54287a4cee3f865a3adbedb313200c15dac8893c096657371bb00bdc152d26d8e83db13bed1a20b2fe5d70ea44f4c5e843d88ef6473233b3323e"

RPROVIDES:${PN} += "qt6-tools-docs-qch qt6-tools-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
