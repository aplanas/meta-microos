SUMMARY = "Python interface to Request Tracker API"
DESCRIPTION = "Python implementation of Request Tracker (a ticketing system) REST API described here: https://rt-wiki.bestpractical.com/wiki/REST"
LICENSE = "GPL-3.0-only"

PV = "3.0.4"

RPM_NAME = "python39-rt-3.0.4-1.3.noarch.rpm"
RPM_HASH = "4c93c5028960ebfd17abcd5ba9f9a7461925a2ddf135db7b69e8b2c44ba2311b80664754f1717aae4a65b284db090ed85e216596499014a80be901be286d27af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(rt) python39-rt python3dist(rt)"
RDEPENDS:${PN} += "python(abi) python39-requests python39-six"

inherit rpm
