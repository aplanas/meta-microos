SUMMARY = "Jupyter widgets base for Vue libraries"
DESCRIPTION = "Jupyter widgets base for Vue libraries"
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "python39-ipyvue-1.9.0-2.1.noarch.rpm"
RPM_HASH = "bc7763a439d4eda25faf425551789510ed20b7e2d02f19fde138343767d45d3d0d0251377a9d7996e7b8b67df5aafa1ef4e0f731dcf0e069dac313087812dd6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ipyvue) python39-ipyvue python3dist(ipyvue)"
RDEPENDS:${PN} += "python(abi) python39-ipywidgets"

inherit rpm
