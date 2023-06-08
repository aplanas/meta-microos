SUMMARY = "Jupyter widgets base for Vue libraries"
DESCRIPTION = "Jupyter widgets base for Vue libraries"
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "python311-ipyvue-1.9.0-2.1.noarch.rpm"
RPM_HASH = "00fabe100c3f9933580c2f599dc1bef2a785e92b7b1b60af56545fa1e65630462091201b26d17c7e71a02badfc75e4a77ce66782a25f7bd24c4d3097af274242"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ipyvue) python311-ipyvue python3dist(ipyvue)"
RDEPENDS:${PN} += "python(abi) python311-ipywidgets"

inherit rpm
