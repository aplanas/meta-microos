SUMMARY = "Python client for Redis key-value store"
DESCRIPTION = "The Python interface to the Redis key-value store."
LICENSE = "MIT"

PV = "4.5.5"

RPM_NAME = "python311-redis-4.5.5-1.1.noarch.rpm"
RPM_HASH = "22a74efa955b08a3389f8d183d6ea4b544277be5803b37ecae30076fe4154b3e742b7532888a8d5db252ce1f3d10450e04d69be52aa2155b36cf65d8b2a2840a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(redis) python311-redis python3dist(redis)"
RDEPENDS:${PN} += "python(abi) python311-async-timeout redis"

inherit rpm
