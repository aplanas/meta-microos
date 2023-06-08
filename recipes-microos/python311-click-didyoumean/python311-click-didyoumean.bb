SUMMARY = "Plugin to enable git-like did-you-mean feature in python-click"
DESCRIPTION = "This package enables a git-like did-you-mean feature in click."
LICENSE = "MIT"

PV = "0.0.3"

RPM_NAME = "python311-click-didyoumean-0.0.3-4.12.noarch.rpm"
RPM_HASH = "3814dd1c0c32e80abdbd962af0768a7d41308f5101aca1efd59eaa3a7437357e78de0b6e151765fe93b3017a178adb2e7dbf6676105fa8240bb2ba86138f5c2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(click-didyoumean) python311-click-didyoumean python3dist(click-didyoumean)"
RDEPENDS:${PN} += "python(abi) python311-click"

inherit rpm
