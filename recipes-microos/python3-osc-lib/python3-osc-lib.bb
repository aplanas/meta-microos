SUMMARY = "OpenStackClient Library"
DESCRIPTION = "OpenStackClient (aka OSC) is a command-line client for OpenStack.  osc-lib \
is a package of common support modules for writing OSC plugins. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "2.7.0"

RPM_NAME = "python3-osc-lib-2.7.0-1.2.noarch.rpm"
RPM_HASH = "af3204f2cafa250bba3187253a2b66b25cc1ba88c7b08b59821427212267e0088a3659330ebb9b483e8b9e546dc50cf4d9171117f7f5fe83269586f373301f06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-osc-lib python3.10dist(osc-lib) python3dist(osc-lib)"
RDEPENDS:${PN} += "python(abi) python3-cliff python3-keystoneauth1 python3-openstacksdk python3-oslo.i18n python3-oslo.utils python3-pbr python3-simplejson python3-six python3-stevedore"

inherit rpm
