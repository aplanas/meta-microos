SUMMARY = "Kubernetes python client"
DESCRIPTION = "Python client for kubernetes http://kubernetes.io/"
LICENSE = "Apache-2.0"

PV = "26.1.0"

RPM_NAME = "python39-kubernetes-26.1.0-4.1.noarch.rpm"
RPM_HASH = "48d241c22c37a5e8d01c7dd0427d0c567648b61809a41261067602a4aa781c771aa17a0eb6f02a9069c3021708a4c57b70de2490ccad21f69910394009e93d89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(kubernetes) python39-kubernetes python3dist(kubernetes)"
RDEPENDS:${PN} += "python(abi) python39-PyYAML python39-certifi python39-google-auth python39-python-dateutil python39-requests python39-requests-oauthlib python39-setuptools python39-six python39-urllib3 python39-websocket-client"

inherit rpm
