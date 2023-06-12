SUMMARY = "ORM/ODM/framework-agnostic library to convert datatypes from/to Python types"
DESCRIPTION = "marshmallow is an ORM/ODM/framework-agnostic library for converting complex \
datatypes, such as objects, to and from native Python datatypes."
LICENSE = "BSD-3-Clause & MIT"

PV = "3.19.0"

RPM_NAME = "python39-marshmallow-3.19.0-4.1.noarch.rpm"
RPM_HASH = "55ae3031e4784287a9aadc12a3ace1b781970b1d531fbbe4fe14c63e05629287bd4748abc0bfb26d5d0f496b00264a23a7215fc83a0e609811279d12f3f2f8b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(marshmallow) python39-marshmallow python3dist(marshmallow)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
