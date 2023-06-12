SUMMARY = "Helpful mixins for unittest classes"
DESCRIPTION = "Helpful mixins for unittest classes."
LICENSE = "Apache-2.0"

PV = "1.6"

RPM_NAME = "python39-unittest-mixins-1.6-2.8.noarch.rpm"
RPM_HASH = "1f572834f73cc0a5f4083ee1566d35c7d15adccdecb33e51bb4fbe14769289f851a8a4ae51cac096d815a972be138d93e852e0ffff8470498c682589d78ddbed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(unittest-mixins) \
python39-unittest-mixins \
python3dist(unittest-mixins)"
RDEPENDS:${PN} += "python(abi) \
python39-six"

inherit rpm
