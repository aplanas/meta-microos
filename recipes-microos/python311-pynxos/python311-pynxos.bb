SUMMARY = "A library for managing Cisco NX-OS devices through NX-API"
DESCRIPTION = "A library for managing Cisco NX-OS devices through NX-API"
LICENSE = "Apache-2.0"

PV = "0.0.5"

RPM_NAME = "python311-pynxos-0.0.5-1.14.noarch.rpm"
RPM_HASH = "128f72ee80b60832922c7470944ec34e5cf3fa54da9e1ddb24adfc8fb3d5660dcb26d369cf4d69980f8ed388dd5ee3a53c9ebeadb5e008609b6cf6b169ce95bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pynxos) \
python311-pynxos \
python3dist(pynxos)"
RDEPENDS:${PN} += "python(abi) \
python311-future \
python311-requests \
python311-scp"

inherit rpm
