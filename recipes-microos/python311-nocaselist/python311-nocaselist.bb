SUMMARY = "A case-insensitive list for Python"
DESCRIPTION = "Class `NocaseList`_ is a case-insensitive list that preserves the lexical case \
of its items."
LICENSE = "Apache-2.0"

PV = "1.0.6"

RPM_NAME = "python311-nocaselist-1.0.6-1.3.noarch.rpm"
RPM_HASH = "74c448a9aa9919745056412168b34e2fec76f1c07f62b427dff0efdabd1ede4eb4eb82d9d06c6f3a86cab0fcc477ad536fb5069e6efec80d17501fc30e5d0852"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(nocaselist) \
python311-nocaselist \
python3dist(nocaselist)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
