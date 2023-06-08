SUMMARY = "PEP 561 type stubs generator for pybind11 modules"
DESCRIPTION = "Generate stubs for python modules.  There are several tweaks to target \
specifically modules compiled using pybind11"
LICENSE = "BSD-3-Clause"

PV = "0.12.0"

RPM_NAME = "python39-pybind11-stubgen-0.12.0-1.4.noarch.rpm"
RPM_HASH = "4389979c5b878d6dd8cd404e2df2ef4c53fb352439807adedd06a44c392d4b61a127824f3182ffa7cbc863cfaf8aa4f7a2c94de0c3632348ce3c9f6f28c15912"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pybind11-stubgen) python39-pybind11-stubgen python3dist(pybind11-stubgen)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) update-alternatives"

inherit rpm
