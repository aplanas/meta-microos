SUMMARY = "Fetch location and size of physical screens"
DESCRIPTION = "Python module to fetch location and size of physical screens."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "python310-screeninfo-0.8.1-1.3.noarch.rpm"
RPM_HASH = "14f3d992974efe814f9c2ab53e6129f98825b349add979249b59e2ce65637cd3aadf328b58cc54c222e26de6b630db5e5c58c8b744083e4be35bde86d100724e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-screeninfo python3.10dist(screeninfo) python310-screeninfo python3dist(screeninfo)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
