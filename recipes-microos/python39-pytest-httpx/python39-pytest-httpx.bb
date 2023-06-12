SUMMARY = "Send responses to httpx"
DESCRIPTION = "Send responses to httpx."
LICENSE = "MIT"

PV = "0.22.0"

RPM_NAME = "python39-pytest-httpx-0.22.0-1.1.noarch.rpm"
RPM_HASH = "1acd25dfb965b206361e1afa7bf4f9a3dd8a95bdf1dbb99494bd24cf290750ebd3cffc3904c8a2105f4eaa979e4af17c372aea45ad207989fd9bc8e25a57adf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-httpx) \
python39-pytest-httpx \
python3dist(pytest-httpx)"
RDEPENDS:${PN} += "python(abi) \
python39-httpx \
python39-pytest"

inherit rpm
