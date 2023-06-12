SUMMARY = "Simple PEP517 package builder"
DESCRIPTION = "Build will invoke the PEP 517 hooks to build a distribution package. \
It is a simple build tool and does not perform any dependency management."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python39-build-0.10.0-3.1.noarch.rpm"
RPM_HASH = "f3fc3ee40e2850bdc5e31264a9a6c2a011672fd05c8cffc70ef77154e64c627beb92edcf165c387d6e95e4576735ec540b0acaed837dca99d83572f7a1dc9a90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(build) python39-build python3dist(build)"
RDEPENDS:${PN} += "(python39-importlib-metadata >= 0.22 if python39-base < 3.8) (python39-tomli >= 1.1.0 if python39-base < 3.11) /bin/sh /usr/bin/python3.9 python(abi) python39-packaging python39-pyproject-hooks update-alternatives"

inherit rpm
