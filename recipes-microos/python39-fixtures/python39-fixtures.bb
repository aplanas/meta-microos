SUMMARY = "Fixtures, reusable state for writing clean tests and more"
DESCRIPTION = "Fixtures defines a Python contract for reusable state / support logic, \
primarily for unit testing. Helper and adaption logic is included to make it \
easy to write your own fixtures using the fixtures contract. Glue code is \
provided that makes using fixtures that meet the Fixtures contract in unittest \
compatible test cases easy and straight forward."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "4.0.1"

RPM_NAME = "python39-fixtures-4.0.1-2.1.noarch.rpm"
RPM_HASH = "e8408e7168be9cde116bb3e54aa41ac16d69d45fe11e22bf3c0a8215fc04017042a89a169b5abfc86fd51625ba2e129ed8ddf09e286baaf3ecbc4bc2712bc5ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(fixtures) python39-fixtures python3dist(fixtures)"
RDEPENDS:${PN} += "python(abi) python39-extras python39-pbr python39-testtools"

inherit rpm
