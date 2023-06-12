SUMMARY = "WSGI Transport Adapter for Requests"
DESCRIPTION = "WSGI Transport Adapter for Requests"
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "python311-requests-wsgi-adapter-0.4.1-1.3.noarch.rpm"
RPM_HASH = "199634b88503357444782e20c4bd57477f1f7363dec41192376c44321e139145c43f5d4f620f269a9ea6ef362b4a33d42d8b2bde24fa5f080b180b5ee90baaf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(requests-wsgi-adapter) \
python311-requests-wsgi-adapter \
python3dist(requests-wsgi-adapter)"
RDEPENDS:${PN} += "python(abi) \
python311-requests"

inherit rpm
