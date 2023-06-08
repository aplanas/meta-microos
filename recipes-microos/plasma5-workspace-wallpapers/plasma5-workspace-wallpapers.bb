SUMMARY = "Additional Plasma Wallpapers"
DESCRIPTION = "Additional wallpapers for Plasma Workspace."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "plasma5-workspace-wallpapers-5.27.4-1.1.noarch.rpm"
RPM_HASH = "23d7c4c65937cb3a7fb990640ae03c5c92344197bee1e9da4dacd6465945f8a7f713a269b39a5c791bf2c73074227ef83a96d6067b8750f90c1aab64bf5b6456"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plasma5-workspace-wallpapers"
RDEPENDS:${PN} += ""

inherit rpm
