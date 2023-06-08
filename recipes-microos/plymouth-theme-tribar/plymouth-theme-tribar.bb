SUMMARY = "Plymouth 'Tribar' theme"
DESCRIPTION = "This package contains the 'Tribar' boot splash theme for \
Plymouth"
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-tribar-22.02.122+94.4bd41a3-4.1.noarch.rpm"
RPM_HASH = "43b31946c3dfdf617ab168a4e1e2108897c0144c715ad11dcf6fd31d3a6be15eb95509604ba1b9af9228b6510e72f50e7a204d18ff5e05595f40c3d7d229efc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-tribar"
RDEPENDS:${PN} += "plymouth-plugin-tribar plymouth-scripts"

inherit rpm
