SUMMARY = "Docker API Client"
DESCRIPTION = "A docker API client in Python"
LICENSE = "Apache-2.0"

PV = "5.0.3"

RPM_NAME = "python311-docker-5.0.3-3.3.noarch.rpm"
RPM_HASH = "71c4be4c838202026995022d36889081f467ed75a16a55756c016fe0015fe02ce5d1a619e5e19108fae003fa3ca631af2af6ad84bfab7d54f47a8fbb14ab4c91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(docker) python311-docker python311-docker-py python3dist(docker)"
RDEPENDS:${PN} += "python(abi) python311-docker-pycreds python311-paramiko python311-requests python311-websocket-client"

inherit rpm
