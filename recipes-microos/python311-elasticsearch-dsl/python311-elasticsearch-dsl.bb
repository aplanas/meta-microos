SUMMARY = "Python client for Elasticsearch"
DESCRIPTION = "Python client for Elasticsearch."
LICENSE = "Apache-2.0"

PV = "7.4.1"

RPM_NAME = "python311-elasticsearch-dsl-7.4.1-1.1.noarch.rpm"
RPM_HASH = "c639c596efe4afdb77035e4c3cd9d62f6fad695c3be403a84775f4296291ba79c8b0a5ad0465f0a361bdb29bab88164319d8bbf5f3f788ebd52e5c08094c476a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(elasticsearch-dsl) python311-elasticsearch-dsl python3dist(elasticsearch-dsl)"
RDEPENDS:${PN} += "(python311-elasticsearch >= 7.0.0 with python311-elasticsearch < 8) python(abi) python311-python-dateutil"

inherit rpm
