SUMMARY = "Nanum Gothic Coding Korean TrueType Fonts"
DESCRIPTION = "Collection of Nanum Gothic Coding Korean TrueType fonts."
LICENSE = "OFL-1.1"

PV = "2.0"

RPM_NAME = "nanum-gothic-coding-fonts-2.0-23.26.noarch.rpm"
RPM_HASH = "1e68148d9cba75b2ac41d188be7e66d0062b31cbb2b26367105ca81eaa056310b71bff528bf53a7bae828d10786e129c9637822da4f8d3848ce60adb1e6a9a72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nanum-gothic-coding nanum-gothic-coding-fonts"
RDEPENDS:${PN} += ""

inherit rpm
