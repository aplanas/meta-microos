SUMMARY = "The KDE Plasma Workspace Cursors"
DESCRIPTION = "This package contains the Oxygen cursor set."
LICENSE = "GPL-3.0-or-later"

PV = "5.27.4"

RPM_NAME = "oxygen5-cursors-5.27.4-1.1.noarch.rpm"
RPM_HASH = "a38eb99d1d325471f3f215ed94f88b8d0e62bd6dc8193efdccba9c1e58298b31a52f7495d8ddad38fe0cf8e39bfd392718d524bfe3ff15a2fd5f4fdd22700e7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oxygen-cursors oxygen-cursors4 oxygen-cursors5 oxygen4-cursors oxygen5-cursors"
RDEPENDS:${PN} += ""

inherit rpm
