SUMMARY = "Tools to work with collections"
DESCRIPTION = "jaraco.collections Tools for working with collections. \
Models and classes to supplement the stdlib ‘collections’ module."
LICENSE = "MIT"

PV = "3.8.0"

RPM_NAME = "python310-jaraco.collections-3.8.0-2.2.noarch.rpm"
RPM_HASH = "512e39d64d3d139a0c51efcd940482cd50d9f56e1c0c04def53e44917f7080faea28c3e263d7ce906b8ec0019b7352d13ab1790c0d21c2648439da7295eeae6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.collections python3.10dist(jaraco.collections) python310-jaraco.collections python3dist(jaraco.collections)"
RDEPENDS:${PN} += "python(abi) python310-jaraco.classes python310-jaraco.text"

inherit rpm
