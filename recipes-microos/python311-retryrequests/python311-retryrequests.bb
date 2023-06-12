SUMMARY = "Extend python requests with exponential back-off retry"
DESCRIPTION = "A Python library for HTTP requests using requests package with \
exponential back-off retry."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-retryrequests-0.2.0-1.3.noarch.rpm"
RPM_HASH = "20914146b3c504885751517ba833f4f34de3b53db48f2c8fa4d4ce17fae5e02364f97b7221be4962fe2913f2fdceecc0467f4f7de4c577a09478df21e0b37bf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(retryrequests) \
python311-retryrequests \
python3dist(retryrequests)"
RDEPENDS:${PN} += "python(abi) \
python311-requests \
python311-setuptools"

inherit rpm
