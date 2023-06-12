SUMMARY = "Client authentication protocol for python-requests"
DESCRIPTION = "Client authentication protocol for python-requests"
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "python311-edgegrid-python-1.2.1-1.8.noarch.rpm"
RPM_HASH = "fdadd81a15651d5d40a0915c58e7708fa889586c560e1e460f5af960a147f34a770041799b5b8e4f7d2facd4be49bc8cc1bcb22bdd3f5a19ec351f0d2559b3a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(edgegrid-python) \
python311-edgegrid-python \
python3dist(edgegrid-python)"
RDEPENDS:${PN} += "python(abi) \
python311-ndg-httpsclient \
python311-pyOpenSSL \
python311-pyasn1 \
python311-requests \
python311-urllib3"

inherit rpm
