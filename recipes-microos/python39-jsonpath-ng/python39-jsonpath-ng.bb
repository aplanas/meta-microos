SUMMARY = "JSONPath for Python"
DESCRIPTION = "A final implementation of JSONPath for Python that aims to be \
standard compliant, including arithmetic and binary comparison \
operators and providing clear AST for metaprogramming."
LICENSE = "Apache-2.0"

PV = "1.5.2"

RPM_NAME = "python39-jsonpath-ng-1.5.2-1.9.noarch.rpm"
RPM_HASH = "4cfbee4ebae9049a7a0bc49b1c3bd6d40d85ceafd1937efbd7de8d7a97dbf1822d08b30ac7e917d54f72460f026ddf25bbd8db1f7ce39eb95e2d38012b9c23ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jsonpath-ng) python39-jsonpath-ng python3dist(jsonpath-ng)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-decorator python39-ply python39-six"

inherit rpm
