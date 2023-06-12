SUMMARY = "Extensible memoizing collections and decorators"
DESCRIPTION = "This module provides various memoizing collections and decorators, \
including a variant of the Python 3 Standard Library `@lru_cache`_ \
function decorator."
LICENSE = "MIT"

PV = "5.3.1"

RPM_NAME = "python39-cachetools-5.3.1-1.1.noarch.rpm"
RPM_HASH = "53818d68fb71d77f56788f27907bad64eca0024343249b425911b4ae03418b697ebabb101ff2884226ebb2ab9b168cd046865c0f99ad811b7e024073e6eea81a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cachetools) \
python39-cachetools \
python3dist(cachetools)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
