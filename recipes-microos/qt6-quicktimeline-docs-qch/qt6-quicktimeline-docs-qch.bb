SUMMARY = "Documentation for qt6-quicktimeline in QCH format"
DESCRIPTION = "This package contains documentation for qt6-quicktimeline in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quicktimeline-docs-qch-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "4f225579d9fc2b1c74c345807e02a330389499ca25b56c2a9c250f36986e73bc22922cf9d7989dc0d69147d6a61ca69085128f5b3e685e0463be8f00f9e58939"

RPROVIDES:${PN} += "qt6-quicktimeline-docs-qch \
qt6-quicktimeline-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
