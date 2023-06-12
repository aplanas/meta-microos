SUMMARY = "Generate source code for Python classes from a JSON schema"
DESCRIPTION = "Generate source code for Python classes from a JSON schema."
LICENSE = "MIT"

PV = "1.2.3"

RPM_NAME = "python311-jschema-to-python-1.2.3-1.6.noarch.rpm"
RPM_HASH = "050e0bc00b5c45ce23f8bdae38eb2d6ccb91c8b8852d5c27aa0e6861bf6d4a940579a6eb4c6e7b07004714d002566bd6119e1c6788b847d6967131fa1e2b3b90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jschema-to-python) \
python311-jschema-to-python \
python3dist(jschema-to-python)"
RDEPENDS:${PN} += "python(abi) \
python311-attrs \
python311-jsonpickle \
python311-pbr"

inherit rpm
