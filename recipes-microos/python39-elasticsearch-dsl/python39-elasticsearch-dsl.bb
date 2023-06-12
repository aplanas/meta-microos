SUMMARY = "Python client for Elasticsearch"
DESCRIPTION = "Python client for Elasticsearch."
LICENSE = "Apache-2.0"

PV = "7.4.1"

RPM_NAME = "python39-elasticsearch-dsl-7.4.1-1.1.noarch.rpm"
RPM_HASH = "67d470869554297d59a86703ac7da20c1f6813d5d8bf2e2da74ffb566e739914f14a74b883700839f418a1a0b8d31a804a063dca25ac04f9a6538560eb0ca251"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(elasticsearch-dsl) python39-elasticsearch-dsl python3dist(elasticsearch-dsl)"
RDEPENDS:${PN} += "(python39-elasticsearch >= 7.0.0 with python39-elasticsearch < 8) python(abi) python39-python-dateutil"

inherit rpm
