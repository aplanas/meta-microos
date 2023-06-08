SUMMARY = "Dictionary with auto-expiring values for caching purposes"
DESCRIPTION = "The core of the library is ExpiringDict class which is an ordered \
dictionary with auto-expiring values for caching purposes. \
Expiration happens on any access, object is locked during cleanup \
from expired values. ExpiringDict can not store more than \
max_len elements - the oldest will be deleted."
LICENSE = "Apache-2.0"

PV = "1.2.2"

RPM_NAME = "python39-expiringdict-1.2.2-1.3.noarch.rpm"
RPM_HASH = "0ad46240109025321910e4bc391c9804eb8342770b03f081722bb9b19875cd5935800ce522589806f0e6bd27a3ad95a5dd26a8da210aea2c0e028cc4a6c5bc22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(expiringdict) python39-expiringdict python3dist(expiringdict)"
RDEPENDS:${PN} += "python(abi) python39-dill python39-typing"

inherit rpm
