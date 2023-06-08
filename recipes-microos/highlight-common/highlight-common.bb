SUMMARY = "Common architecture-independent files for highlight"
DESCRIPTION = "This package provides some architecture-independent files for highlight such as \
configuration and themes."
LICENSE = "GPL-3.0-or-later"

PV = "4.5"

RPM_NAME = "highlight-common-4.5-1.3.noarch.rpm"
RPM_HASH = "07d46dc433c3044c509fa7f1b1e34ea99fc0b3c6efc6d954ab654c7e57b37ada0cbb1d8f9493b302f55976c2e18b88436849e26fe5c85ed2f7ba0a6eaf3803f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(highlight-common) highlight-common"
RDEPENDS:${PN} += ""

inherit rpm
