SUMMARY = "Osinfo database files"
DESCRIPTION = "The osinfo database provides information about operating systems and \
hypervisor platforms to facilitate the automated configuration and \
provisioning of new virtual machines"
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "20230308"

RPM_NAME = "osinfo-db-20230308-1.1.noarch.rpm"
RPM_HASH = "ebc5d87ff05a8a0db4d4785214ce18029c872f4bc8146344cd8bf2e927b5ca19b3fdcdbf4c2c6fa98598799263597bdf76d3f99b94f0d04105307441aff5453d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "osinfo-db"
RDEPENDS:${PN} += ""

inherit rpm
