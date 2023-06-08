SUMMARY = "A tiny LRU cache implementation and decorator"
DESCRIPTION = "repoze.lru is a LRU (least recently used) cache implementation.  Keys and \
values that are not used frequently will be evicted from the cache faster \
than keys and values that are used frequently.  It works under Python 2.5, \
Python 2.6, Python 2.7, and Python 3.2."
LICENSE = "SUSE-Repoze"

PV = "0.7"

RPM_NAME = "python39-repoze.lru-0.7-2.16.noarch.rpm"
RPM_HASH = "f460be30c8b8e89b2ae0fdf365dde66eb1f2d77a17c743db2977fde8a8b7031c4493cdfa8de7c42036cbf038d65caf02c349b5c87a353e3e5dc378803c6a7ebe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(repoze.lru) python39-repoze.lru python3dist(repoze.lru)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
