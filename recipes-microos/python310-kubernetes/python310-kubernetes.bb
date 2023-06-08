SUMMARY = "Kubernetes python client"
DESCRIPTION = "Python client for kubernetes http://kubernetes.io/"
LICENSE = "Apache-2.0"

PV = "26.1.0"

RPM_NAME = "python310-kubernetes-26.1.0-4.1.noarch.rpm"
RPM_HASH = "e4134bcec5aa71bb33a49a54e464cf0278141823b08cdd688ae9b6f65d6514af45ded9e39930cad87d8c6cd7a8807cb1b6cc13ace56d850b44f240844a28832c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kubernetes python3.10dist(kubernetes) python310-kubernetes python3dist(kubernetes)"
RDEPENDS:${PN} += "python(abi) python310-PyYAML python310-certifi python310-google-auth python310-python-dateutil python310-requests python310-requests-oauthlib python310-setuptools python310-six python310-urllib3 python310-websocket-client"

inherit rpm
