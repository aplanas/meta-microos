SUMMARY = "Generic map viewer: data"
DESCRIPTION = "Marble is a viewer of map data. This package contains its data."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "marble-data-23.04.0-1.1.noarch.rpm"
RPM_HASH = "79e166aa04336d0fd5125e484381670749e612c5a11886d49f71eccc343e124bed6b68158558afbcb51317762bbc1dc9bf1c53844dee9bf2558e50bb40e7b101"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "marble-data marble5-data"
RDEPENDS:${PN} += "marble"

inherit rpm
