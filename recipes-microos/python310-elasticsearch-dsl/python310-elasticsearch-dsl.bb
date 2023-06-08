SUMMARY = "Python client for Elasticsearch"
DESCRIPTION = "Python client for Elasticsearch."
LICENSE = "Apache-2.0"

PV = "7.4.0"

RPM_NAME = "python310-elasticsearch-dsl-7.4.0-2.3.noarch.rpm"
RPM_HASH = "91ce56d1c7024210c77382aaf7c5b24156d4cfdd72733aa121ed7865f165844f0e0af7557a0c70b44eb9eefe685003745c67a5c2bd28bf7afd123c3108d3f71e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-elasticsearch-dsl python3.10dist(elasticsearch-dsl) python310-elasticsearch-dsl python3dist(elasticsearch-dsl)"
RDEPENDS:${PN} += "(python310-elasticsearch >= 7.0.0 with python310-elasticsearch < 8) python(abi) python310-python-dateutil"

inherit rpm
