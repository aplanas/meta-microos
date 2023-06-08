SUMMARY = "Python client for Elasticsearch"
DESCRIPTION = "Python client for Elasticsearch."
LICENSE = "Apache-2.0"

PV = "7.4.0"

RPM_NAME = "python311-elasticsearch-dsl-7.4.0-2.3.noarch.rpm"
RPM_HASH = "708e388821f8fd13cc3b7dcb8fd1b96bff06a0c4c2275ba8d1bae07e031348b7253fb6e9fb49adf0290b6efce3bb4e9cf7a645606f542036c485e93e926f716a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(elasticsearch-dsl) python311-elasticsearch-dsl python3dist(elasticsearch-dsl)"
RDEPENDS:${PN} += "(python311-elasticsearch >= 7.0.0 with python311-elasticsearch < 8) python(abi) python311-python-dateutil"

inherit rpm
