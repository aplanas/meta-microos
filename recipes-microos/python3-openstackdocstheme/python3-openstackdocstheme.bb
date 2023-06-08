SUMMARY = "OpenStack Docs Theme"
DESCRIPTION = "Theme and extension support for Sphinx documentation that is published \
to docs.openstack.org. Intended for use by OpenStack projects."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "python3-openstackdocstheme-3.1.0-1.1.noarch.rpm"
RPM_HASH = "5ebaf7532fdd2e1736f0b5925accdbd3a9fb4c80d16aaf792a1e32ebe3278c72ba211029ff47dd9c58b989103190411589c12279d21bad7000b23b244a27d0ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openstackdocstheme python3.10dist(openstackdocstheme) python3dist(openstackdocstheme)"
RDEPENDS:${PN} += "/bin/bash /usr/bin/python3 python(abi) python3-Sphinx python3-dulwich"

inherit rpm
