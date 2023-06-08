SUMMARY = "Build backend used by Hatch"
DESCRIPTION = "This is the extensible, standards compliant build backend used by Hatch."
LICENSE = "MIT"

PV = "1.14.1"

RPM_NAME = "python310-hatchling-1.14.1-1.1.noarch.rpm"
RPM_HASH = "d220f66509b54af7185ae41b810a915ccd8187d4d62024d161d0081dd6f8c6ae848cd6a4daefa63d83c2beb59cdabcce7f190135b86a82239cc9ede7d3b98fc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hatchling python3.10dist(hatchling) python310-hatchling python3dist(hatchling)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-editables python310-packaging python310-pathspec python310-pluggy python310-tomli python310-trove-classifiers update-alternatives"

inherit rpm
