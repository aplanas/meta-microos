SUMMARY = "ORM/ODM/framework-agnostic library to convert datatypes from/to Python types"
DESCRIPTION = "marshmallow is an ORM/ODM/framework-agnostic library for converting complex \
datatypes, such as objects, to and from native Python datatypes."
LICENSE = "BSD-3-Clause & MIT"

PV = "3.19.0"

RPM_NAME = "python311-marshmallow-3.19.0-3.1.noarch.rpm"
RPM_HASH = "07e459b1a1cebb46bcb3924bc579cef6edc6bf330a5ca0caebc1af8f1fb052ffa185ce3fcb59bc09f183f0da1dde6f609e7cdfb5f12038b376443e8f3ef6c0e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(marshmallow) python311-marshmallow python3dist(marshmallow)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
