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

RPM_NAME = "python311-python-memcached-1.59-6.3.noarch.rpm"
RPM_HASH = "6c9278c822c93635bffcf27867323c04c3539b36022f761cb1f0d3a044f30a77653292f52d7c45c9cc41f54f72ce59a920cdb462dc9e3fd31e5f9632b1462d92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-memcached) python311-python-memcached python3dist(python-memcached)"
RDEPENDS:${PN} += "memcached python(abi) python311-six"

inherit rpm
