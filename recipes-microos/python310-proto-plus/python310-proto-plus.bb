SUMMARY = "Pythonic Protocol Buffers"
DESCRIPTION = "This is a wrapper around protocol buffers. Protocol buffers is \
a specification format for APIs, such as those inside Google. \
This library provides protocol buffer message classes and objects \
that largely behave like native Python types."
LICENSE = "Apache-2.0"

PV = "1.22.2"

RPM_NAME = "python310-proto-plus-1.22.2-1.2.noarch.rpm"
RPM_HASH = "33229419d5d03d83035444652d40618592ff286d0344f5ac6d57d7307823fc97aa56d7879c2936b3efa02ca18cbad506d47698d506d93ece322ea1a1b1c39184"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-proto-plus python3.10dist(proto-plus) python310-proto-plus python3dist(proto-plus)"
RDEPENDS:${PN} += "python(abi) python310-protobuf"

inherit rpm
