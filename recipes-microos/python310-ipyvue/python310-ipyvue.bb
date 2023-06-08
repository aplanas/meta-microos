SUMMARY = "Jupyter widgets base for Vue libraries"
DESCRIPTION = "Jupyter widgets base for Vue libraries"
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "python310-ipyvue-1.9.0-2.1.noarch.rpm"
RPM_HASH = "2aa6e5d4eaacbf5e08a90ab043daf51f7dcd4cf281e3e2d15fc9b877eea9eedd3d5e52ef2101c5a5ae7520fb199d0950cb423c5a19e76a7dd77b0daf19d03da8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipyvue python3.10dist(ipyvue) python310-ipyvue python3dist(ipyvue)"
RDEPENDS:${PN} += "python(abi) python310-ipywidgets"

inherit rpm
