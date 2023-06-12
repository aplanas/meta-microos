SUMMARY = "Cache storage for Openstack projects"
DESCRIPTION = "oslo.cache aims to provide a generic caching mechanism for OpenStack projects \
by wrapping the dogpile.cache library. The dogpile.cache library provides \
support memoization, key value storage and interfaces to common caching \
backends such as Memcached."
LICENSE = "Apache-2.0"

PV = "3.3.1"

RPM_NAME = "python3-oslo.cache-3.3.1-1.2.noarch.rpm"
RPM_HASH = "8d94df7cb9c70bf6130ba15b6a363161d36d604389b1e0f2b12d4312976f1052057633e58730b235d1141b06056802fbf2296a42add3aa91601eaf1372ab2e5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.cache \
python3.10dist(oslo.cache) \
python3dist(oslo.cache)"
RDEPENDS:${PN} += "python(abi) \
python3-dogpile.cache \
python3-oslo.config \
python3-oslo.i18n \
python3-oslo.log \
python3-oslo.utils \
python3-python-memcached"

inherit rpm
