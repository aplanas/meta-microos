SUMMARY = "A least recently used (LRU) cache implementation"
DESCRIPTION = "Pylru implements a true LRU cache along with several support classes. The cache is efficient and written in pure Python. It works with Python 2.6+ including the 3.x series. Basic operations (lookup, insert, delete) all run in a constant amount of time. Pylru provides a cache class with a simple dict interface. It also provides classes to wrap any object that has a dict interface with a cache. Both write-through and write-back semantics are supported. Pylru also provides classes to wrap functions in a similar way, including a function decorator."
LICENSE = "GPL-2.0-only"

PV = "1.2.1"

RPM_NAME = "python310-pylru-1.2.1-1.3.noarch.rpm"
RPM_HASH = "0e1a3682b8d9c779f9ee06a5b84d0a61e54f14d1896288416f9ee46ac7777091fa6518f07cea86432595e9e9f07eb55fb61fe15422c4edebb8011f7bf14c592b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pylru \
python3.10dist(pylru) \
python310-pylru \
python3dist(pylru)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
