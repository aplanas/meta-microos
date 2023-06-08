SUMMARY = "Pytest plugin to exit successfully when a required percent of tests pass"
DESCRIPTION = "Change the exit code of pytest test sessions when a required percent of tests pass."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python311-pytest-percent-0.1.2-1.12.noarch.rpm"
RPM_HASH = "a64c7d64b905845976644ed0f88ede099335170f735eeeb23baf9181315b57b9d072d1365b3f5083ecd0f7f5da98b24ee6b419b1c4d4bb32fbb3b4804b5b2bf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-percent) python311-pytest-percent python3dist(pytest-percent)"
RDEPENDS:${PN} += "python(abi) python311-pytest"

inherit rpm
