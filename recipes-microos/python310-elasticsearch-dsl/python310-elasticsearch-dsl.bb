SUMMARY = "Python client for Elasticsearch"
DESCRIPTION = "Python client for Elasticsearch."
LICENSE = "Apache-2.0"

PV = "7.4.1"

RPM_NAME = "python310-elasticsearch-dsl-7.4.1-1.1.noarch.rpm"
RPM_HASH = "40ebece0ccee418c6b2b8fb7dca2827f75e9c17682a5d0b6145dc132a4a7fdc16b86986993c4e63ff3abdba26d8c09b28fed2e4d1b2b0671a010e74b14b00b50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-elasticsearch-dsl python3.10dist(elasticsearch-dsl) python310-elasticsearch-dsl python3dist(elasticsearch-dsl)"
RDEPENDS:${PN} += "(python310-elasticsearch >= 7.0.0 with python310-elasticsearch < 8) python(abi) python310-python-dateutil"

inherit rpm
