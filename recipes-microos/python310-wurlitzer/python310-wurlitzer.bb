SUMMARY = "Python package to capture C-level output in context managers"
DESCRIPTION = "Wurlitzer is a python package to capture C-level \
output in context managers."
LICENSE = "MIT"

PV = "3.0.3"

RPM_NAME = "python310-wurlitzer-3.0.3-1.3.noarch.rpm"
RPM_HASH = "8d49b2cef2ee2238b83584fc62ae0d5ccc46d6ef96de45583ec8ddca200d3673b464bb0023af93b51966ca294859f3db798fc31fd231f38f7a6333825e824f63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wurlitzer python3.10dist(wurlitzer) python310-wurlitzer python3dist(wurlitzer)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
