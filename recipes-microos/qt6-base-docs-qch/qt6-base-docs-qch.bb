SUMMARY = "Documentation for qt6-base in QCH format"
DESCRIPTION = "This package contains documentation for qt6-base in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-base-docs-qch-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "cc1fee9f9a32e57f37160a20f54ebc8a8323c8e8419aa06281066847ef297ffca0c6a9ef70107cb90364c5e066a5125c7bc9534afd7a163b119d45f041b6515a"

RPROVIDES:${PN} += "qt6-base-docs-qch qt6-base-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
