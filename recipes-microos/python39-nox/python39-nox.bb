SUMMARY = "Flexible test automation"
DESCRIPTION = "Flexible test automation."
LICENSE = "Apache-2.0"

PV = "2023.4.22"

RPM_NAME = "python39-nox-2023.4.22-1.1.noarch.rpm"
RPM_HASH = "1fc1b546400ca2e69b23729f97839b61089fc6e01a11bf01c10cc35b1d37da31f40d67beea10beec24ccc8cd7b5ca3fa2e884381980a756222243ff30d3e3aef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(nox) python39-nox python3dist(nox)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-argcomplete python39-colorlog python39-setuptools python39-virtualenv update-alternatives"

inherit rpm
