SUMMARY = "Helpful mixins for unittest classes"
DESCRIPTION = "Helpful mixins for unittest classes."
LICENSE = "Apache-2.0"

PV = "1.6"

RPM_NAME = "python311-unittest-mixins-1.6-2.8.noarch.rpm"
RPM_HASH = "e17942fcdc0a7c5e35ab8260e9d579a67ea29bd157168b72796b997469eaabdb6a6331f4f9e145a760390cf4c070bde6f275d032e7d271272d7150b2468174bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(unittest-mixins) \
python311-unittest-mixins \
python3dist(unittest-mixins)"
RDEPENDS:${PN} += "python(abi) \
python311-six"

inherit rpm
