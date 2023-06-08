SUMMARY = "Common data for xviewer-plugins"
DESCRIPTION = "Common data required by all xviewer plugins"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "xviewer-plugins-data-1.4.1-1.6.noarch.rpm"
RPM_HASH = "bc8097c558239245d08233462889cebf6a924e1be5b840e478acf38ddeade1a398bf94275d2aa932ec57c3685322d71da60c1a85f7a836b899d4e01278df5ab7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xviewer-plugins-data"
RDEPENDS:${PN} += "xviewer"

inherit rpm
