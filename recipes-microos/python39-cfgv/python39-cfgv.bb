SUMMARY = "Configuration validator producing human readable error messages"
DESCRIPTION = "A configuration validator for Python that produce human readable error messages."
LICENSE = "MIT"

PV = "3.3.1"

RPM_NAME = "python39-cfgv-3.3.1-1.6.noarch.rpm"
RPM_HASH = "dc948071975e83aff83267860a41825b8a53d158c0f4076fc558328ec03f5586dbd62da7c1ea5310d932c04289d6563005279b2c5a68e1892614880dbed58e7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cfgv) python39-cfgv python3dist(cfgv)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
