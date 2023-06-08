SUMMARY = "A tiny LRU cache implementation and decorator"
DESCRIPTION = "repoze.lru is a LRU (least recently used) cache implementation.  Keys and \
values that are not used frequently will be evicted from the cache faster \
than keys and values that are used frequently.  It works under Python 2.5, \
Python 2.6, Python 2.7, and Python 3.2."
LICENSE = "SUSE-Repoze"

PV = "0.7"

RPM_NAME = "python310-repoze.lru-0.7-2.16.noarch.rpm"
RPM_HASH = "257b974c975c9a92490a8ba8be148796f567ac2d9d876f291acf04a19b8134a2b70cf3e50944e8ef882f0c9c92257af50f64fd831c09fe965264a4dbfa9a0bae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-repoze.lru python3.10dist(repoze.lru) python310-repoze.lru python3dist(repoze.lru)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
