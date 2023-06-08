SUMMARY = "Simple PEP517 package builder"
DESCRIPTION = "Build will invoke the PEP 517 hooks to build a distribution package. \
It is a simple build tool and does not perform any dependency management."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python311-build-0.10.0-2.1.noarch.rpm"
RPM_HASH = "bf06696ca65ea3a5e40b2662bef59b4dd4e5d599b9cbd119b9c9896eea754772c046e8028b853f7baab9c02df3d7d02d8c621f45b599eefc03c2be41786f7b58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(build) python311-build python3dist(build)"
RDEPENDS:${PN} += "(python311-importlib-metadata >= 0.22 if python311-base < 3.8) (python311-tomli >= 1.1.0 if python311-base < 3.11) /bin/sh /usr/bin/python3.11 python(abi) python311-packaging python311-pyproject-hooks update-alternatives"

inherit rpm
