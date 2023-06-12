SUMMARY = "Tools to work with collections"
DESCRIPTION = "jaraco.collections Tools for working with collections. \
Models and classes to supplement the stdlib ‘collections’ module."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python39-jaraco.collections-4.1.0-1.1.noarch.rpm"
RPM_HASH = "8164fb9d5710f59368211a1fd28625c33ea74db47802c2d6f51abd38e1d19fb119abdaf404d0d18a64211a9946355f315723893f8aadbbffa70bd6d09639a4d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jaraco.collections) python39-jaraco.collections python3dist(jaraco.collections)"
RDEPENDS:${PN} += "python(abi) python39-jaraco.classes python39-jaraco.text"

inherit rpm
