SUMMARY = "Documentation for yaz (Z39.50 Library)"
DESCRIPTION = "YAZ is a C library for developing client and server applications \
using the ANSI/NISO Z39.50 protocol for Information Retrieval. \
 \
This package contains the documentation."
LICENSE = "BSD-3-Clause"

PV = "5.34.0"

RPM_NAME = "yaz-doc-5.34.0-1.3.noarch.rpm"
RPM_HASH = "9038200e4d8ac94f6fbae00d7a3a481a4773031151524b3f06eb343228adb62a3153ac9b3f49b3006ed87dffd43bd0711b1070c1271f135c652321bdddd128c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yaz-doc"
RDEPENDS:${PN} += ""

inherit rpm
