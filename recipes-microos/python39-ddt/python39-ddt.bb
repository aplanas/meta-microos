SUMMARY = "Data-Driven/Decorated Tests"
DESCRIPTION = "A library to multiply test cases."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python39-ddt-1.6.0-3.1.noarch.rpm"
RPM_HASH = "fef56e46c6d5c4a55c233b45d0a30d584d7c7a76e07a33c33977e72c8ffcc982d4c8c95ff89cade9e80205fa7ad0e9c6d53b2e4409546679f48664cf91c6966d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ddt) python39-ddt python3dist(ddt)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
