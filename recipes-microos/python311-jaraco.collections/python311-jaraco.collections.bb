SUMMARY = "Tools to work with collections"
DESCRIPTION = "jaraco.collections Tools for working with collections. \
Models and classes to supplement the stdlib ‘collections’ module."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python311-jaraco.collections-4.1.0-1.1.noarch.rpm"
RPM_HASH = "31bc1fecb9fbe6cc5f34cbf645cea85ad490f1fcc62339eab84d7a58b0458ef0a849f2242ef723383360acb47de5ffd68026091d1ea4c7ef8c60a09cfe3f1bd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jaraco.collections) python311-jaraco.collections python3dist(jaraco.collections)"
RDEPENDS:${PN} += "python(abi) python311-jaraco.classes python311-jaraco.text"

inherit rpm
