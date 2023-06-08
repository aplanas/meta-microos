SUMMARY = "Common protobufs used in Google APIs"
DESCRIPTION = "googleapis-common-protos contains the python classes generated from the common \
protos in the googleapis_ repository."
LICENSE = "Apache-2.0"

PV = "1.59.0"

RPM_NAME = "python39-googleapis-common-protos-1.59.0-1.1.noarch.rpm"
RPM_HASH = "3517a7e2b13e2a28b1c46b617835d1438a25fec3f87cc096a8a3acba8189b3cc497489d38be514598824268e07119d35572a3b6722ccf576b8f0c187bd3cc1db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(googleapis-common-protos) python39-googleapis-common-protos python3dist(googleapis-common-protos)"
RDEPENDS:${PN} += "python(abi) python39-protobuf"

inherit rpm
