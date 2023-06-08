SUMMARY = "Python logging component with a simple interface"
DESCRIPTION = "Python logging component providing a single object \
which dispatches log messages to configured handlers."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python311-loguru-0.7.0-1.1.noarch.rpm"
RPM_HASH = "98ca2aad51f330e2ce3b31c962d057fc9e16db066ba780bde738dcedbf7fea1dc35bf0d27161892a461f7b41d71edb946d480b41cd0de94f135b33b01a1c82cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(loguru) python311-loguru python3dist(loguru)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
