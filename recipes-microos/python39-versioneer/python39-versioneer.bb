SUMMARY = "VCS-based management of project version strings"
DESCRIPTION = "Versioneer is a tool to automatically update version strings (in \
setup.py and the conventional ‘from PROJECT import _version’ pattern) \
by asking the version control system about the current tree."
LICENSE = "Unlicense"

PV = "0.26"

RPM_NAME = "python39-versioneer-0.26-1.4.noarch.rpm"
RPM_HASH = "d0e7819d7d2c43365c90558eab1977cf8638926485b7786c907dd673acd2b53bdafa451daca4661c451568d735ca67f29298aa07ad00739e54da67cec5ab6643"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(versioneer) python39-versioneer python3dist(versioneer)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) update-alternatives"

inherit rpm
