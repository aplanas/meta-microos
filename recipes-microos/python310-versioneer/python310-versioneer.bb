SUMMARY = "VCS-based management of project version strings"
DESCRIPTION = "Versioneer is a tool to automatically update version strings (in \
setup.py and the conventional ‘from PROJECT import _version’ pattern) \
by asking the version control system about the current tree."
LICENSE = "Unlicense"

PV = "0.26"

RPM_NAME = "python310-versioneer-0.26-1.4.noarch.rpm"
RPM_HASH = "864e2c8fba46ce410251482c0560d6011ec71d75062b0fe18db215e7d8c5fbc8dba251f10a82fb328fdf93f1e72e8640bce76013fd7a50a9a14f22c9fab843af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-versioneer python3.10dist(versioneer) python310-versioneer python3dist(versioneer)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) update-alternatives"

inherit rpm
