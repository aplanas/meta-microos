SUMMARY = "Extensible memoizing collections and decorators"
DESCRIPTION = "This module provides various memoizing collections and decorators, \
including a variant of the Python 3 Standard Library `@lru_cache`_ \
function decorator."
LICENSE = "MIT"

PV = "5.3.0"

RPM_NAME = "python310-cachetools-5.3.0-2.1.noarch.rpm"
RPM_HASH = "910058a05e8b3aba098d7440523fdbaf4acfc853d5ae02a884f3e87d34b59d4aed8209da5c81adf6c23145b65e052424ac23289b5e1ca13a017500da11fdbfa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cachetools python3.10dist(cachetools) python310-cachetools python3dist(cachetools)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
