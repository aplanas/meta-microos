SUMMARY = "Salt modules and states for SAP Applications and SLE-HA components management"
DESCRIPTION = "Salt modules and states for SAP Applications and SLE-HA components management"
LICENSE = "Apache-2.0"

PV = "0.3.11+git.1622732434.835d199"

RPM_NAME = "salt-shaptools-0.3.11+git.1622732434.835d199-1.6.noarch.rpm"
RPM_HASH = "8581f623c85b424e567d9a60d14bb1f18da08387badcaa6ff93805ca65d5e5738f4a8359fff4744a0c65daada13e8e0ad5176f7972661289c07e59465afe249c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "salt-shaptools"
RDEPENDS:${PN} += ""

inherit rpm
