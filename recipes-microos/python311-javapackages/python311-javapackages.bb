SUMMARY = "Module for handling various files for Java packaging"
DESCRIPTION = "Module for handling, querying and manipulating of various files for Java \
packaging in Linux distributions"
LICENSE = "BSD-3-Clause"

PV = "6.1.0"

RPM_NAME = "python311-javapackages-6.1.0-2.3.noarch.rpm"
RPM_HASH = "d7c2c5f72473de7ca226b6fdd716d3a0bff7e3e14924e9900c7ead285f60fa7a34e254fe50ce7ac14e4cd0266e2bf490f3b3f895c4c57629929be70e1da81ecd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(javapackages) python311-javapackages python3dist(javapackages)"
RDEPENDS:${PN} += "python(abi) python311-lxml"

inherit rpm
