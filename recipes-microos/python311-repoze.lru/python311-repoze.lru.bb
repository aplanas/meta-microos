SUMMARY = "A tiny LRU cache implementation and decorator"
DESCRIPTION = "repoze.lru is a LRU (least recently used) cache implementation.  Keys and \
values that are not used frequently will be evicted from the cache faster \
than keys and values that are used frequently.  It works under Python 2.5, \
Python 2.6, Python 2.7, and Python 3.2."
LICENSE = "SUSE-Repoze"

PV = "0.7"

RPM_NAME = "python311-repoze.lru-0.7-2.16.noarch.rpm"
RPM_HASH = "c36d6dc7639786d26c810b042cdb89e07c7adecb9da4122b7c5a385d2de78e2e4381d9b295098bd4db12c218e95e7cb377364369c81480e76b4fbb4a60509511"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(repoze.lru) python311-repoze.lru python3dist(repoze.lru)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
