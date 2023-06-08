SUMMARY = "Kubernetes python client"
DESCRIPTION = "Python client for kubernetes http://kubernetes.io/"
LICENSE = "Apache-2.0"

PV = "26.1.0"

RPM_NAME = "python311-kubernetes-26.1.0-4.1.noarch.rpm"
RPM_HASH = "c018a131dbf6c8f29742b8b00802bf0d06b1f8efa9e258d752933fc05eeb924d97e985d94ad31fc2c5d8334d43279cf953ecfa5b945c95b413c23101dc1b218c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(kubernetes) python311-kubernetes python3dist(kubernetes)"
RDEPENDS:${PN} += "python(abi) python311-PyYAML python311-certifi python311-google-auth python311-python-dateutil python311-requests python311-requests-oauthlib python311-setuptools python311-six python311-urllib3 python311-websocket-client"

inherit rpm
