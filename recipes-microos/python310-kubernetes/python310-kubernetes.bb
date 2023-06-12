SUMMARY = "Kubernetes python client"
DESCRIPTION = "Python client for kubernetes http://kubernetes.io/"
LICENSE = "Apache-2.0"

PV = "26.1.0"

RPM_NAME = "python310-kubernetes-26.1.0-5.1.noarch.rpm"
RPM_HASH = "a6b32f16d985d803f62e942b7037a32c655ef228ae4928e665cf53c63772c6f40851b4925113638e60b6f46107aac24de5ea27bb7b8f3f7935c9acff0ea4e663"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kubernetes python3.10dist(kubernetes) python310-kubernetes python3dist(kubernetes)"
RDEPENDS:${PN} += "python(abi) python310-PyYAML python310-certifi python310-google-auth python310-python-dateutil python310-requests python310-requests-oauthlib python310-setuptools python310-six python310-urllib3 python310-websocket-client"

inherit rpm
