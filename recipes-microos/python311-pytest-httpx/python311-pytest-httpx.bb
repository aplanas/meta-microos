SUMMARY = "Send responses to httpx"
DESCRIPTION = "Send responses to httpx."
LICENSE = "MIT"

PV = "0.21.2"

RPM_NAME = "python311-pytest-httpx-0.21.2-1.3.noarch.rpm"
RPM_HASH = "b85b8ffdf86a8b6ba8ed30d32535b8c0acaa02aac1f739a90a4b9184d95b3494a537bedd3a88a059150e8c240c5694aa14ac847ae79ae65fca0ef6e48547f482"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-httpx) python311-pytest-httpx python3dist(pytest-httpx)"
RDEPENDS:${PN} += "python(abi) python311-httpx python311-pytest"

inherit rpm
