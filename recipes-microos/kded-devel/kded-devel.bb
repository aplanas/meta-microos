SUMMARY = "Central daemon of KDE workspaces: Build Environment"
DESCRIPTION = "KDED runs in the background and performs a number of small tasks. \
Some of these tasks are built in, others are started on demand. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kded-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "7632037ec277dfa50452f050da647d69c7a37d8eb06c3a20e494ce11852da9d1f2d0416b9c951708c29c91edb6d0a4cf22fbf4bab1d156f7bdb3937040948a0f"

RPROVIDES:${PN} += "cmake(KDED) kded-devel kded-devel(aarch-64)"
RDEPENDS:${PN} += "extra-cmake-modules kded"

inherit rpm
