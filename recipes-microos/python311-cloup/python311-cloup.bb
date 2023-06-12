SUMMARY = "Option groups, constraints, subcommand sections and help themes for Click"
DESCRIPTION = "This module adds features to python-click: option groups, \
constraints, subcommand sections and help themes."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python311-cloup-2.1.0-1.1.noarch.rpm"
RPM_HASH = "20a912b527adfe464c1068ab3d570d71d61320c9dcb7786542b8f6cbdd584faa853a6a2877ec6f3cf0954b0618c68feca97004e6c6fa03d61f014fb90438aaff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cloup) python311-cloup python3dist(cloup)"
RDEPENDS:${PN} += "python(abi) python311-click"

inherit rpm
