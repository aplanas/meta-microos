SUMMARY = "Marble documentation"
DESCRIPTION = "Marble is a viewer of map data. This package contains its documentation."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "marble-doc-23.04.0-1.1.noarch.rpm"
RPM_HASH = "218d2975bca37172a67ce7a39a3db6f117309fc74ae337ec7ac88f326dc4f3c9ebfa3d0f82eb3bb2c81aa415372c97d5bc22283a64198186e246f279abe4fb9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "marble-doc marble5-doc"
RDEPENDS:${PN} += "marble"

inherit rpm
