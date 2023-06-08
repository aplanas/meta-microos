SUMMARY = "Common protobufs used in Google APIs"
DESCRIPTION = "googleapis-common-protos contains the python classes generated from the common \
protos in the googleapis_ repository."
LICENSE = "Apache-2.0"

PV = "1.59.0"

RPM_NAME = "python310-googleapis-common-protos-1.59.0-1.1.noarch.rpm"
RPM_HASH = "2a6907a864eaaba3e20c5a76dbf44188c2013225fb273459391dcbc98c0717459e67ee9876c574a2f06f32e67bc10a8a0d36ec81ed3275cc90dbe3235a7ffb08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-googleapis-common-protos python3.10dist(googleapis-common-protos) python310-googleapis-common-protos python3dist(googleapis-common-protos)"
RDEPENDS:${PN} += "python(abi) python310-protobuf"

inherit rpm
