SUMMARY = "Documentation for qt6-scxml in QCH format"
DESCRIPTION = "This package contains documentation for qt6-scxml in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-scxml-docs-qch-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "f8f5f72eab38e4abe16893ae54078f8720d46bdce2c27b0d7512391d159e418f8937b007d64f6ca06baa8986571a8cc432483d7d244d388a0e19ba8bb704c58d"

RPROVIDES:${PN} += "qt6-scxml-docs-qch qt6-scxml-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
