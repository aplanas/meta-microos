SUMMARY = "Development package for kdgantt2"
DESCRIPTION = "The development package for the kdgantt2 libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "16.08.3"

RPM_NAME = "kdgantt2-devel-16.08.3-4.16.aarch64.rpm"
RPM_HASH = "bdd0e9e2afc439a054b037f68c96cae2ae85a8304c2d05cd4af1970857e722e085ea60c0c1b7cb03bc04907d3b7a7fd40abe4dcd52dedaedcac6b14fc681a78d"

RPROVIDES:${PN} += "cmake(KF5KDGantt2) kdgantt2-devel kdgantt2-devel(aarch-64)"
RDEPENDS:${PN} += "libKF5KDGantt2-5"

inherit rpm
