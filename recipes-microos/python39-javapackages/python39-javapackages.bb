SUMMARY = "Module for handling various files for Java packaging"
DESCRIPTION = "Module for handling, querying and manipulating of various files for Java \
packaging in Linux distributions"
LICENSE = "BSD-3-Clause"

PV = "6.1.0"

RPM_NAME = "python39-javapackages-6.1.0-2.3.noarch.rpm"
RPM_HASH = "f204a7d9b6187c3be16f4cd2f5da1860e1900571f44bd787e68411d1ead3b0657722e50ae29cb98091fd0345c9b11088d9474f91af9a3f96c6f8cb8ef763d145"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(javapackages) python39-javapackages python3dist(javapackages)"
RDEPENDS:${PN} += "python(abi) python39-lxml"

inherit rpm
