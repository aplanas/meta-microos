SUMMARY = "Fixtures, reusable state for writing clean tests and more"
DESCRIPTION = "Fixtures defines a Python contract for reusable state / support logic, \
primarily for unit testing. Helper and adaption logic is included to make it \
easy to write your own fixtures using the fixtures contract. Glue code is \
provided that makes using fixtures that meet the Fixtures contract in unittest \
compatible test cases easy and straight forward."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "4.1.0"

RPM_NAME = "python310-fixtures-4.1.0-1.1.noarch.rpm"
RPM_HASH = "a75611e1a6e91414f20a82f635861e80d8399bf62dd8a4f9a8015a5fdb78b24c95f735f23557ffdd1b90ba06624657dc3a9f0dfa5a51b39e246af9b8d028f13f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fixtures python3.10dist(fixtures) python310-fixtures python3dist(fixtures)"
RDEPENDS:${PN} += "python(abi) python310-extras python310-pbr python310-testtools"

inherit rpm
