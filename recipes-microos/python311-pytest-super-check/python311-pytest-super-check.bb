SUMMARY = "Pytest plugin to check your TestCase classes call super in setUp, tearDown, etc"
DESCRIPTION = "Pytest plugin to check your TestCase classes call super in setUp, tearDown, etc."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python311-pytest-super-check-2.1.0-1.17.noarch.rpm"
RPM_HASH = "f3a1bd90de6bd15c57afd828fb2af2e70b534d4cc0b7cd47d85b86ea9c72fa476ba07afa548b89dc81a357271d678caf99f80d2fa07071e93b19edc3155f4843"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-super-check) python311-pytest-super-check python3dist(pytest-super-check)"
RDEPENDS:${PN} += "python(abi) python311-pytest"

inherit rpm
