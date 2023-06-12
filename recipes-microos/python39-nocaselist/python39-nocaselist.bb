SUMMARY = "A case-insensitive list for Python"
DESCRIPTION = "Class `NocaseList`_ is a case-insensitive list that preserves the lexical case \
of its items."
LICENSE = "Apache-2.0"

PV = "1.0.6"

RPM_NAME = "python39-nocaselist-1.0.6-1.3.noarch.rpm"
RPM_HASH = "4a27fd9a2b770fa93a46442e05e0eacf74501ebc6fafb112b75ce8170706f41a330708d8a3a8dff5c57327b0e6e98e95444aee8d7b213c952a9f79b0d588e5e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(nocaselist) \
python39-nocaselist \
python3dist(nocaselist)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
