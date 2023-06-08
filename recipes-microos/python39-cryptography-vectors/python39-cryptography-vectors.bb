SUMMARY = "Test vectors for the cryptography package"
DESCRIPTION = "Vectors for testing of the python cryptography package."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "40.0.2"

RPM_NAME = "python39-cryptography-vectors-40.0.2-2.1.noarch.rpm"
RPM_HASH = "cbfb9c1bce9e9534d14a1bbbc9bdb63d9353b4a8124ac0b888470f2067eac46a2ae0fc7829c1931fa48665ab0b188573271070ac25eebc185f828db380241368"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cryptography-vectors) python39-cryptography-vectors python3dist(cryptography-vectors)"
RDEPENDS:${PN} += "/bin/sh python(abi)"

inherit rpm
