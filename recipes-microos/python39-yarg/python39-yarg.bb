SUMMARY = "A PyPI client"
DESCRIPTION = "A PyPI client."
LICENSE = "MIT"

PV = "0.1.9"

RPM_NAME = "python39-yarg-0.1.9-2.8.noarch.rpm"
RPM_HASH = "83c3f31e2a06f71f48b6fde86a39f0e71bede1f2e78971998d416c1b2544632cf18a5a4d3059f57e8fa4d8fea58038898405ceee0854ddb352906746788ac4c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(yarg) \
python39-yarg \
python3dist(yarg)"
RDEPENDS:${PN} += "python(abi) \
python39-requests"

inherit rpm
