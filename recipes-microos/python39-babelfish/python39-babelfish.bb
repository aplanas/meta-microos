SUMMARY = "A Python library to work with countries and languages"
DESCRIPTION = "BabelFish is a Python library to work with countries and languages."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python39-babelfish-0.6.0-1.8.noarch.rpm"
RPM_HASH = "080517a4c33d4014ad22a8cdb3f6c30879b14f01e086e3df7e0c142cb48d8ae74a668a54f0a2afc28223566f68bd1df4f1a24766d18c6516fe69564292f02382"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(babelfish) python39-babelfish python3dist(babelfish)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
