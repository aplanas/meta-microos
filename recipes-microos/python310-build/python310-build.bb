SUMMARY = "Simple PEP517 package builder"
DESCRIPTION = "Build will invoke the PEP 517 hooks to build a distribution package. \
It is a simple build tool and does not perform any dependency management."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python310-build-0.10.0-2.1.noarch.rpm"
RPM_HASH = "8a0872868d531d0adcfb405a50c70843bce8bccb1edc13479bca107f817a45adc8a8edd78debffbb71aef33fc83f7489fadd7a798c42c9b6a9a2d71b0e60b6b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-build python3.10dist(build) python310-build python3dist(build)"
RDEPENDS:${PN} += "(python310-importlib-metadata >= 0.22 if python310-base < 3.8) (python310-tomli >= 1.1.0 if python310-base < 3.11) /bin/sh /usr/bin/python3.10 python(abi) python310-packaging python310-pyproject-hooks update-alternatives"

inherit rpm
