SUMMARY = "System user for the osc-collab server component"
DESCRIPTION = "System user for the osc-collab server component."
LICENSE = "BSD-3-Clause"

PV = "0.104+26"

RPM_NAME = "system-user-osc-collab-0.104+26-1.1.noarch.rpm"
RPM_HASH = "6e45e4c2435239951ac3934299712e1aed79e335892da122aba886a672d446e6a2f99be4dbefadd32b14ef68c1d46c6c4aa2de43cad6db30056c6ac711d3f6e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group(osc-collab) system-user-osc-collab user(osc-collab)"
RDEPENDS:${PN} += "/bin/sh sysuser-shadow"

inherit rpm
