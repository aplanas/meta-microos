SUMMARY = "Documentation for qt6-connectivity in QCH format"
DESCRIPTION = "This package contains documentation for qt6-connectivity in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-connectivity-docs-qch-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "115ea5238ef43580d01dcda173410be115c0f333f897af6bc02426854eb62c4bf7ccd8ac5fa4756758b4373ff847426d72ab5058f00b2444f51f1165379ca46a"

RPROVIDES:${PN} += "qt6-connectivity-docs-qch qt6-connectivity-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
