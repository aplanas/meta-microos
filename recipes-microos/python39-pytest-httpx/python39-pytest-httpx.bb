SUMMARY = "Send responses to httpx"
DESCRIPTION = "Send responses to httpx."
LICENSE = "MIT"

PV = "0.21.2"

RPM_NAME = "python39-pytest-httpx-0.21.2-1.3.noarch.rpm"
RPM_HASH = "c87031b6682759861e153306f490200033e89d548019d2a0772212b98fd3079c05a1371b6411f61d45c3c9193e25a450096793998389be77297ef23e1253ac64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-httpx) python39-pytest-httpx python3dist(pytest-httpx)"
RDEPENDS:${PN} += "python(abi) python39-httpx python39-pytest"

inherit rpm
