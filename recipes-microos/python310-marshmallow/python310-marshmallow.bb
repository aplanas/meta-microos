SUMMARY = "ORM/ODM/framework-agnostic library to convert datatypes from/to Python types"
DESCRIPTION = "marshmallow is an ORM/ODM/framework-agnostic library for converting complex \
datatypes, such as objects, to and from native Python datatypes."
LICENSE = "BSD-3-Clause & MIT"

PV = "3.19.0"

RPM_NAME = "python310-marshmallow-3.19.0-3.1.noarch.rpm"
RPM_HASH = "f39acffb65a48ea76bcef09b71a2498a4f63fdfd7a7bb6de229b0c0b5900e8c42c1efabdbf194c5f6783ede7f24ca3bed01ce4093b42fad770a339a0d4251896"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-marshmallow python3.10dist(marshmallow) python310-marshmallow python3dist(marshmallow)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
