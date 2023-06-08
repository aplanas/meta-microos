SUMMARY = "VCS-based management of project version strings"
DESCRIPTION = "Versioneer is a tool to automatically update version strings (in \
setup.py and the conventional ‘from PROJECT import _version’ pattern) \
by asking the version control system about the current tree."
LICENSE = "Unlicense"

PV = "0.26"

RPM_NAME = "python311-versioneer-0.26-1.4.noarch.rpm"
RPM_HASH = "e2b7c22e28eb91706a4445ed91eb1dcc8a389dcc011572f8147041d940a6c76d73c15ae3285bc0ae117d0531849b2f139e2d93ca6de4cd8cea9a74f9f90e6f4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(versioneer) python311-versioneer python3dist(versioneer)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) update-alternatives"

inherit rpm
