SUMMARY = "Operating system virtual terminal plugin for the Spyder IDE"
DESCRIPTION = "Spyder, the Scientific Python Development Environment, is an \
IDE for researchers, engineers and data analysts. \
 \
This package contains the plugin for displaying a virtual terminal \
(OS independent) inside the main Spyder window. It uses a nodejs \
backend."
LICENSE = "MIT"

PV = "1.2.2"

RPM_NAME = "python3-spyder-terminal-1.2.2-1.3.noarch.rpm"
RPM_HASH = "bd69013724c5b97be3d94f3be523f2a344b6b4267a9d14bb4f7d2e5ee8cbfcae09f4286da79d00188718355d5a7fd8fd7782ec9312030c18a7e7ce12491575c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-spyder-terminal python3.10dist(spyder-terminal) python3dist(spyder-terminal) spyder-terminal spyder3-terminal"
RDEPENDS:${PN} += "/usr/bin/env python(abi) python3-coloredlogs python3-requests python3-terminado python3-tornado spyder"

inherit rpm
