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

RPM_NAME = "python39-python-memcached-1.59-6.3.noarch.rpm"
RPM_HASH = "a0535c0c122829fb43c7f3e0abd1bc0ef9745ae83193b03fa7cac844b982223559caf38c42aff95529da58f056914afa16863026fece16761d5fa97992043481"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-memcached) python39-python-memcached python3dist(python-memcached)"
RDEPENDS:${PN} += "memcached python(abi) python39-six"

inherit rpm
