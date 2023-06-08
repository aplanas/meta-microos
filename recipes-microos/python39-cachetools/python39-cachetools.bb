SUMMARY = "Extensible memoizing collections and decorators"
DESCRIPTION = "This module provides various memoizing collections and decorators, \
including a variant of the Python 3 Standard Library `@lru_cache`_ \
function decorator."
LICENSE = "MIT"

PV = "5.3.0"

RPM_NAME = "python39-cachetools-5.3.0-2.1.noarch.rpm"
RPM_HASH = "5d3cf5eabe42ab643aee5f3cdb03811810912a17b372cba87b3a581e3b4caedd8e4df7ebe1fe33b5b3a41b7d790afe45e71d19a7d2cde506ee43878d600a64ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cachetools) python39-cachetools python3dist(cachetools)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
