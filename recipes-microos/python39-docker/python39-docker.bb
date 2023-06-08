SUMMARY = "Docker API Client"
DESCRIPTION = "A docker API client in Python"
LICENSE = "Apache-2.0"

PV = "5.0.3"

RPM_NAME = "python39-docker-5.0.3-3.3.noarch.rpm"
RPM_HASH = "8e21f8932f5128d0fea528b1a630d91ad5a2e4844145c07439acdca260eaa4b0301c42679c1933c703bcac4abe3782c53c4987376ae778f1bc9f57b5d13475dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(docker) python39-docker python39-docker-py python3dist(docker)"
RDEPENDS:${PN} += "python(abi) python39-docker-pycreds python39-paramiko python39-requests python39-websocket-client"

inherit rpm
