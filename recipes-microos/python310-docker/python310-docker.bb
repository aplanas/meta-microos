SUMMARY = "Docker API Client"
DESCRIPTION = "A docker API client in Python"
LICENSE = "Apache-2.0"

PV = "5.0.3"

RPM_NAME = "python310-docker-5.0.3-3.3.noarch.rpm"
RPM_HASH = "134d5b5d684d22e77d6bacf7f9e1bb519c4353ecc8994305e1ba7ec29f11f023c9ada2351707f4b8b9e65350f438232de75290b4a86ae0b3ca2f2f8005e0ed13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-docker python3-docker-py python3.10dist(docker) python310-docker python310-docker-py python3dist(docker)"
RDEPENDS:${PN} += "python(abi) python310-docker-pycreds python310-paramiko python310-requests python310-websocket-client"

inherit rpm
