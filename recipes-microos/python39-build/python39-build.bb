SUMMARY = "Simple PEP517 package builder"
DESCRIPTION = "Build will invoke the PEP 517 hooks to build a distribution package. \
It is a simple build tool and does not perform any dependency management."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python39-build-0.10.0-2.1.noarch.rpm"
RPM_HASH = "e217115d885c0c16c8966c0702267368a9b1f024bd1c93c8c3d4345b9964b298c828566ffff614b600daa2c0c61f61df16ac19ce6e9141dc44ab607163f8854b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(build) python39-build python3dist(build)"
RDEPENDS:${PN} += "(python39-importlib-metadata >= 0.22 if python39-base < 3.8) (python39-tomli >= 1.1.0 if python39-base < 3.11) /bin/sh /usr/bin/python3.9 python(abi) python39-packaging python39-pyproject-hooks update-alternatives"

inherit rpm
