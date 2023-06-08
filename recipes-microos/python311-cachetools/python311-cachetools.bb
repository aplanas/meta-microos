SUMMARY = "Extensible memoizing collections and decorators"
DESCRIPTION = "This module provides various memoizing collections and decorators, \
including a variant of the Python 3 Standard Library `@lru_cache`_ \
function decorator."
LICENSE = "MIT"

PV = "5.3.0"

RPM_NAME = "python311-cachetools-5.3.0-2.1.noarch.rpm"
RPM_HASH = "a9b09ebc40e71692b184a31a53eb32f6d4c520b5a48aea21bf3d65aaccbe37139e62ebfde9a43ba2a73ac628ffcd3c7461aa89a8c66c5d77d170425e66e81d70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cachetools) python311-cachetools python3dist(cachetools)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
