SUMMARY = "A minimalist production ready plugin system"
DESCRIPTION = "This is the core framework used by the pytest, tox, and devpi projects."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-pluggy-1.0.0-2.1.noarch.rpm"
RPM_HASH = "3df432f85812714c8755fb26f93f140393acc7ff34631edb5c7414c6762a156a4555150eaeeef148a438de127260d8fefa050204ab9dfc17501e8a47c022edf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pluggy) \
python39-pluggy \
python3dist(pluggy)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
