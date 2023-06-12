SUMMARY = "Access memcached via its binary protocol with SASL auth support"
DESCRIPTION = "A pure python module to access memcached via its binary protocol with SASL auth support"
LICENSE = "MIT"

PV = "0.31.2"

RPM_NAME = "python310-python-binary-memcached-0.31.2-1.1.noarch.rpm"
RPM_HASH = "a7a9e6820a896f5fd879e3eb5dcd0a1f91aaf023391de0e339bda0c804f9f68077da9dbe37d80475b83ab5e7ca63951a30a8c49cde639fdae18d35bd25401404"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-binary-memcached \
python3.10dist(python-binary-memcached) \
python310-python-binary-memcached \
python3dist(python-binary-memcached)"
RDEPENDS:${PN} += "python(abi) \
python310-six \
python310-uhashring"

inherit rpm
