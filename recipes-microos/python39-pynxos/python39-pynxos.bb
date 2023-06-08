SUMMARY = "A library for managing Cisco NX-OS devices through NX-API"
DESCRIPTION = "A library for managing Cisco NX-OS devices through NX-API"
LICENSE = "Apache-2.0"

PV = "0.0.5"

RPM_NAME = "python39-pynxos-0.0.5-1.14.noarch.rpm"
RPM_HASH = "f1b4c36ae2e25ef16114c04f0d2edb3a9e9885ad62235967af095dfb3dd8b7c1bd26ec6e9e3ff37e314ef40e56de960906324a011da88720bc2603a9557da9f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pynxos) python39-pynxos python3dist(pynxos)"
RDEPENDS:${PN} += "python(abi) python39-future python39-requests python39-scp"

inherit rpm
