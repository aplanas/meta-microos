SUMMARY = "Python client for Redis key-value store"
DESCRIPTION = "The Python interface to the Redis key-value store."
LICENSE = "MIT"

PV = "4.5.4"

RPM_NAME = "python311-redis-4.5.4-2.1.noarch.rpm"
RPM_HASH = "d7744fec074fa6be8f535ff8a54fd1aab7fab303db6a7f338eca8a0d3a3875bdf0d7439cc48aad6d33008baf4f098d1caeaa63910fa17d5a3c0a66f352374d36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(redis) python311-redis python3dist(redis)"
RDEPENDS:${PN} += "python(abi) python311-async-timeout redis"

inherit rpm
