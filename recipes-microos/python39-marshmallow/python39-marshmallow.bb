SUMMARY = "ORM/ODM/framework-agnostic library to convert datatypes from/to Python types"
DESCRIPTION = "marshmallow is an ORM/ODM/framework-agnostic library for converting complex \
datatypes, such as objects, to and from native Python datatypes."
LICENSE = "BSD-3-Clause & MIT"

PV = "3.19.0"

RPM_NAME = "python39-marshmallow-3.19.0-3.1.noarch.rpm"
RPM_HASH = "dd7c55989c8eacb6b180f3a4b89f4a68f46622f56f62928a047e6f21c40959ac6c8666f128f1cda0a5ebd074be8fdbd8d7e4e36a8bf52eb7ad1a42a7f7df871e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(marshmallow) python39-marshmallow python3dist(marshmallow)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
