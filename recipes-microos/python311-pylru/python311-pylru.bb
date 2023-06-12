SUMMARY = "A least recently used (LRU) cache implementation"
DESCRIPTION = "Pylru implements a true LRU cache along with several support classes. The cache is efficient and written in pure Python. It works with Python 2.6+ including the 3.x series. Basic operations (lookup, insert, delete) all run in a constant amount of time. Pylru provides a cache class with a simple dict interface. It also provides classes to wrap any object that has a dict interface with a cache. Both write-through and write-back semantics are supported. Pylru also provides classes to wrap functions in a similar way, including a function decorator."
LICENSE = "GPL-2.0-only"

PV = "1.2.1"

RPM_NAME = "python311-pylru-1.2.1-1.3.noarch.rpm"
RPM_HASH = "30f4fc83f84f67edd0e18fd7dc3027c220b91dec87db9e3b00a9c2fe2d7c72f9d168b86ea1f43911b823423b7074e4fdc02400ac441e2ed4d32ab796b59d9d6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pylru) \
python311-pylru \
python3dist(pylru)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
