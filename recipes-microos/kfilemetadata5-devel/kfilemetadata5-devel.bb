SUMMARY = "Development package for kfilemetadata"
DESCRIPTION = "A library for extracting file metadata. Development files"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.105.0"

RPM_NAME = "kfilemetadata5-devel-5.105.0-1.2.aarch64.rpm"
RPM_HASH = "4c61a380b714a3ddee5df1a02edb26ffcd651a2e5740e82b01a46b85965ffb4a071cd59f71b6e9deaaeafa264926597c40f313afe1579921331ec8c1e1bf89fa"

RPROVIDES:${PN} += "cmake(KF5FileMetaData) kfilemetadata5-devel kfilemetadata5-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Core) extra-cmake-modules kfilemetadata5"

inherit rpm
