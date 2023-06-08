SUMMARY = "Fixtures, reusable state for writing clean tests and more"
DESCRIPTION = "Fixtures defines a Python contract for reusable state / support logic, \
primarily for unit testing. Helper and adaption logic is included to make it \
easy to write your own fixtures using the fixtures contract. Glue code is \
provided that makes using fixtures that meet the Fixtures contract in unittest \
compatible test cases easy and straight forward."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "4.0.1"

RPM_NAME = "python310-fixtures-4.0.1-2.1.noarch.rpm"
RPM_HASH = "07160f9d320b8c8def900746c8805046008dcd65278c18fc94237843ec012035b995905f388cecfb4f92e7206f4c985f5e849c09377b7f18e125b257da5f1844"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fixtures python3.10dist(fixtures) python310-fixtures python3dist(fixtures)"
RDEPENDS:${PN} += "python(abi) python310-extras python310-pbr python310-testtools"

inherit rpm
