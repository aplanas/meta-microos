SUMMARY = "Python client for Redis key-value store"
DESCRIPTION = "The Python interface to the Redis key-value store."
LICENSE = "MIT"

PV = "4.5.5"

RPM_NAME = "python39-redis-4.5.5-1.1.noarch.rpm"
RPM_HASH = "701362a4be1f38535da0d5117cf158f5b5dbd06f20ed23dfcd6ad1885682bc1dd649436dfc00d253ecc027fd6487e07d676eff0d617818b44d8afcdc603102fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(redis) python39-redis python3dist(redis)"
RDEPENDS:${PN} += "python(abi) python39-async-timeout redis"

inherit rpm
