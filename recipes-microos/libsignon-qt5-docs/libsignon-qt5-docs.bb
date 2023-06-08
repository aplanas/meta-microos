SUMMARY = "Documentation for libsignon-qt1"
DESCRIPTION = "This package contains the documentation for the signon-qt library."
LICENSE = "LGPL-2.0-only"

PV = "8.60"

RPM_NAME = "libsignon-qt5-docs-8.60-2.18.noarch.rpm"
RPM_HASH = "4c52b0ce97c3fb67f88444afc72fea58a89c3dfa427d9e6a5246823f2f1126cabddc572a9d8e19541d61c21a2240ce263715d173da417ce648e32d35466f3bd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libsignon-qt5-docs"
RDEPENDS:${PN} += ""

inherit rpm
