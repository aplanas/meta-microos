SUMMARY = "An object wrapper for JSON Schema definitions"
DESCRIPTION = "An object wrapper for JSON Schema definitions"
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python39-python-jsonschema-objects-0.4.1-3.3.noarch.rpm"
RPM_HASH = "d60049d8f986412e2217ddde5a70f5ce224fe577ea0a95c80e987eaf3ae4fc5af04213149a01f7a84fdc5912cf1d8ecf73c3ca152706e95c3bd6d51a8576c3fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-jsonschema-objects) \
python39-python-jsonschema-objects \
python3dist(python-jsonschema-objects)"
RDEPENDS:${PN} += "python(abi) \
python39-Markdown \
python39-inflection \
python39-jsonschema \
python39-six"

inherit rpm
