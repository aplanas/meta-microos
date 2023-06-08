SUMMARY = "One API for multiple git forges"
DESCRIPTION = "One API for multiple git forges."
LICENSE = "MIT"

PV = "0.41.0"

RPM_NAME = "python310-ogr-0.41.0-1.3.noarch.rpm"
RPM_HASH = "318ad48e000cb1a7e3df6090a0798da807f32b240502570f731ff5ba39565aa5975da484db6d6b06222b8e23768fdc5165ce4ebc39adc6c127aa3c745b3c694a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ogr python3.10dist(ogr) python310-ogr python3dist(ogr)"
RDEPENDS:${PN} += "python(abi) python310-Deprecated python310-GitPython python310-PyGithub python310-PyYAML python310-cryptography python310-python-gitlab python310-requests"

inherit rpm
