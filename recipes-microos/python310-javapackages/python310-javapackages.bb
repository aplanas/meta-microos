SUMMARY = "Module for handling various files for Java packaging"
DESCRIPTION = "Module for handling, querying and manipulating of various files for Java \
packaging in Linux distributions"
LICENSE = "BSD-3-Clause"

PV = "6.1.0"

RPM_NAME = "python310-javapackages-6.1.0-2.3.noarch.rpm"
RPM_HASH = "3aab0c5373ee5c01335546eae8d2ea1f6ed67f839199f0c90e52c5790784e6813e72105a6cd402e3ab8e2e1c759edd74ace17d3615adcaf8867482d701a2f8b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-javapackages python3.10dist(javapackages) python310-javapackages python3dist(javapackages)"
RDEPENDS:${PN} += "python(abi) python310-lxml"

inherit rpm
