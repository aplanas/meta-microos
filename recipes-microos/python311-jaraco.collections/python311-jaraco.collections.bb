SUMMARY = "Tools to work with collections"
DESCRIPTION = "jaraco.collections Tools for working with collections. \
Models and classes to supplement the stdlib ‘collections’ module."
LICENSE = "MIT"

PV = "3.8.0"

RPM_NAME = "python311-jaraco.collections-3.8.0-2.2.noarch.rpm"
RPM_HASH = "b5a6d9fbfc2ba6535cd5bf8d7e1b10dde565d3e459ca9f37abc7ac7e9bb4eedae7f1e0fb1012ed1992beb068f372768839833108eadf0b66dea38024f77c6893"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jaraco.collections) python311-jaraco.collections python3dist(jaraco.collections)"
RDEPENDS:${PN} += "python(abi) python311-jaraco.classes python311-jaraco.text"

inherit rpm
