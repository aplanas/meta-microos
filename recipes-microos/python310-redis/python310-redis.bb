SUMMARY = "Python client for Redis key-value store"
DESCRIPTION = "The Python interface to the Redis key-value store."
LICENSE = "MIT"

PV = "4.5.4"

RPM_NAME = "python310-redis-4.5.4-2.1.noarch.rpm"
RPM_HASH = "0b04362168b36977c6ee0023ddb7b81f3bedaf7d93d84cd71fefb5210c55915130edf6766bdd497d8b303689573b2c951cc6405da8c13c85acd5b1300a6fa4b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-redis python3.10dist(redis) python310-redis python3dist(redis)"
RDEPENDS:${PN} += "python(abi) python310-async-timeout redis"

inherit rpm
