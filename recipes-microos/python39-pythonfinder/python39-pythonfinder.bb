SUMMARY = "A tool to locate Python on the system"
DESCRIPTION = "A Python discovery tool to locate Python on the system."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python39-pythonfinder-1.3.1-3.4.noarch.rpm"
RPM_HASH = "27b8a02cd8d175de1f13427afdc619c2b19567b03ecc021731adf15b42ae049ff136596847c22ba44050e537052ca4618fb3dd418d660ecee15e3a2e1926eb9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pythonfinder) python39-pythonfinder python3dist(pythonfinder)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-attrs python39-cached-property python39-click python39-packaging python39-vistir update-alternatives"

inherit rpm
