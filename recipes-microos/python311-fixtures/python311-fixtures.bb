SUMMARY = "Fixtures, reusable state for writing clean tests and more"
DESCRIPTION = "Fixtures defines a Python contract for reusable state / support logic, \
primarily for unit testing. Helper and adaption logic is included to make it \
easy to write your own fixtures using the fixtures contract. Glue code is \
provided that makes using fixtures that meet the Fixtures contract in unittest \
compatible test cases easy and straight forward."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "4.0.1"

RPM_NAME = "python311-fixtures-4.0.1-2.1.noarch.rpm"
RPM_HASH = "8aa9367fe201b9c68eb25eacd70b7142f8639c358da103ce7e9edc4d92068819dcbd40e2780ed5e9227dd0dbd9310c36deb551a14af76ed99f8519deb662565b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(fixtures) python311-fixtures python3dist(fixtures)"
RDEPENDS:${PN} += "python(abi) python311-extras python311-pbr python311-testtools"

inherit rpm
