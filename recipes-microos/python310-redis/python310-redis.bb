SUMMARY = "Python client for Redis key-value store"
DESCRIPTION = "The Python interface to the Redis key-value store."
LICENSE = "MIT"

PV = "4.5.5"

RPM_NAME = "python310-redis-4.5.5-1.1.noarch.rpm"
RPM_HASH = "0008c4036a0754304074a6cad36a56571fae795586c586692fca07a899a6bcb3ffbb07f60db76cd13c36d030ab53f7d6a5fab7e2e525a3b83b2dc4268fc0cfd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-redis python3.10dist(redis) python310-redis python3dist(redis)"
RDEPENDS:${PN} += "python(abi) python310-async-timeout redis"

inherit rpm
