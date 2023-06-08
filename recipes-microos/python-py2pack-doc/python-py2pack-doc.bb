SUMMARY = "Documentation for python-py2pack"
DESCRIPTION = "Documentation and help files for python-py2pack."
LICENSE = "Apache-2.0"

PV = "0.8.7"

RPM_NAME = "python-py2pack-doc-0.8.7-2.3.noarch.rpm"
RPM_HASH = "8074290fd0bf45ee07c2f9e8cc24d3a14d946a9f1e6e3ad7fe874fd12e75544b4e313a6ecc7077b566f3c430e6c4849c4311cb98b2f7bc53920b2c9c7e0f2e09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-py2pack-doc python310-py2pack-doc python311-py2pack-doc python39-py2pack-doc"
RDEPENDS:${PN} += ""

inherit rpm
