SUMMARY = "Data files for Widelands"
DESCRIPTION = "Data files for Widelands. Includes localization, maps graphics and music."
LICENSE = "GPL-2.0-or-later"

PV = "1.1"

RPM_NAME = "widelands-data-1.1-3.1.noarch.rpm"
RPM_HASH = "0a45c00c4d75a0e1e6ab7d0794126eb71e00e84abb9257bd6a4031c0f766ed8785281e8e66fd2baef17bb23941942f1181ef51f8f3aab849d48fa9c33f9b0fc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "widelands-data"
RDEPENDS:${PN} += "widelands"

inherit rpm
