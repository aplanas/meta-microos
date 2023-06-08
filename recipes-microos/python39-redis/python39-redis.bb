SUMMARY = "Python client for Redis key-value store"
DESCRIPTION = "The Python interface to the Redis key-value store."
LICENSE = "MIT"

PV = "4.5.4"

RPM_NAME = "python39-redis-4.5.4-2.1.noarch.rpm"
RPM_HASH = "ffea577504d59c8fc9472bd4a5cdee2a53a9daca8f09687a9f2c1985728625c66f9bad825182c842850b124b4cfe61bbe13da5d770cd09329fd2e8a9aeb4f071"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(redis) python39-redis python3dist(redis)"
RDEPENDS:${PN} += "python(abi) python39-async-timeout redis"

inherit rpm
