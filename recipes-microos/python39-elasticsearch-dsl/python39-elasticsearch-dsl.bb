SUMMARY = "Python client for Elasticsearch"
DESCRIPTION = "Python client for Elasticsearch."
LICENSE = "Apache-2.0"

PV = "7.4.0"

RPM_NAME = "python39-elasticsearch-dsl-7.4.0-2.3.noarch.rpm"
RPM_HASH = "22f885675c6d7161131eabc1728dafcfe8356c1d383a13fb6d85b1b7f643928a4ef4d8d8ee179ae283463ebdd951a31f44fff905018a856b6b154e7de60e96a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(elasticsearch-dsl) python39-elasticsearch-dsl python3dist(elasticsearch-dsl)"
RDEPENDS:${PN} += "(python39-elasticsearch >= 7.0.0 with python39-elasticsearch < 8) python(abi) python39-python-dateutil"

inherit rpm
