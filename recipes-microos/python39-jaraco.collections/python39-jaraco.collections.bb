SUMMARY = "Tools to work with collections"
DESCRIPTION = "jaraco.collections Tools for working with collections. \
Models and classes to supplement the stdlib ‘collections’ module."
LICENSE = "MIT"

PV = "3.8.0"

RPM_NAME = "python39-jaraco.collections-3.8.0-2.2.noarch.rpm"
RPM_HASH = "5d205efacacefb945b003ea25e6e07ed7205b55b4f44bfc86402045829c177b11f48f6f1a1bac3b3ec36e3eadafab637273cbad47e42e34893420087069da1cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jaraco.collections) python39-jaraco.collections python3dist(jaraco.collections)"
RDEPENDS:${PN} += "python(abi) python39-jaraco.classes python39-jaraco.text"

inherit rpm
