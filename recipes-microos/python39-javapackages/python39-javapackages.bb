SUMMARY = "Module for handling various files for Java packaging"
DESCRIPTION = "Module for handling, querying and manipulating of various files for Java \
packaging in Linux distributions"
LICENSE = "BSD-3-Clause"

PV = "6.1.0"

RPM_NAME = "python39-javapackages-6.1.0-3.1.noarch.rpm"
RPM_HASH = "6309f1e4d8fb2cfe4fd5e7f169c520641be5ffea916ebde1a3782078c240e360ef1e9cd8e86f69b20eb06a0b04d1165ac646332b107ff26a4d6852dd9e4943b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(javapackages) python39-javapackages python3dist(javapackages)"
RDEPENDS:${PN} += "python(abi) python39-lxml python39-xml"

inherit rpm
