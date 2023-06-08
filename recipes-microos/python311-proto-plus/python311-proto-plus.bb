SUMMARY = "Pythonic Protocol Buffers"
DESCRIPTION = "This is a wrapper around protocol buffers. Protocol buffers is \
a specification format for APIs, such as those inside Google. \
This library provides protocol buffer message classes and objects \
that largely behave like native Python types."
LICENSE = "Apache-2.0"

PV = "1.22.2"

RPM_NAME = "python311-proto-plus-1.22.2-1.2.noarch.rpm"
RPM_HASH = "ed336d2ec0a88c116fd079b661a2a27cb6c4bdfae32690723f8f305b416a9f46c761d7a0cde89b7c2d5d82a44f816d20d8ec006f3c58f523dc0305895563143d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(proto-plus) python311-proto-plus python3dist(proto-plus)"
RDEPENDS:${PN} += "python(abi) python311-protobuf"

inherit rpm
