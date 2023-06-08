SUMMARY = "Pure python memcached client"
DESCRIPTION = "This package was originally written by Evan Martin of Danga. \
Sean Reifschneider of tummy.com, ltd. has taken over maintenance of it. \
 \
This software is a 100% Python interface to the memcached memory cache \
daemon.  It is the client side software which allows storing values in one \
or more, possibly remote, memcached servers.  Search google for memcached \
for more information."
LICENSE = "Python-2.0"

PV = "1.59"

RPM_NAME = "python310-python-memcached-1.59-6.3.noarch.rpm"
RPM_HASH = "c3e2d467d09d57d989da213845e5afba7b2fdff6f40bbf731b12381892471108a56be0205dac9a8203ab9e0665f13d726401394c578bed794416f94f8d096db0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-memcached python3.10dist(python-memcached) python310-python-memcached python3dist(python-memcached)"
RDEPENDS:${PN} += "memcached python(abi) python310-six"

inherit rpm
