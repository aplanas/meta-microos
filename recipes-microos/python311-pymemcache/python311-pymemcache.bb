SUMMARY = "A pure Python memcached client"
DESCRIPTION = "A pure-Python memcached client. \
 \
pymemcache supports the following features: \
 \
* Complete implementation of the memcached text protocol. \
* Configurable timeouts for socket connect and send/recv calls. \
* Access to the 'noreply' flag, which can significantly increase the speed of writes. \
* Flexible, simple approach to serialization and deserialization. \
* The (optional) ability to treat network and memcached errors as cache misses."
LICENSE = "Apache-2.0"

PV = "4.0.0"

RPM_NAME = "python311-pymemcache-4.0.0-3.1.noarch.rpm"
RPM_HASH = "fc816cfeabada84dc170a90514f05ca7bc66fe8047513dfd86d984aa9cb4a1b5f3b7a71b7a848e31b5cd874831b9c0d6663a58a3bfd2eb5da948e14bf9f3d126"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pymemcache) python311-pymemcache python3dist(pymemcache)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
