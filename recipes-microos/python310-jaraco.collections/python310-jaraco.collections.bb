SUMMARY = "Tools to work with collections"
DESCRIPTION = "jaraco.collections Tools for working with collections. \
Models and classes to supplement the stdlib ‘collections’ module."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python310-jaraco.collections-4.1.0-1.1.noarch.rpm"
RPM_HASH = "30292b32a6415cec3315d2af845f29f62d4b34c9ae8081aa50c30e73da2649d05e5aa51ca992da6ee8afa0301b34c254938ec68ec8944578a0af9128fb52e982"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.collections python3.10dist(jaraco.collections) python310-jaraco.collections python3dist(jaraco.collections)"
RDEPENDS:${PN} += "python(abi) python310-jaraco.classes python310-jaraco.text"

inherit rpm
