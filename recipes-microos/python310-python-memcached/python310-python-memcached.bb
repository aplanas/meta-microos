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

RPM_NAME = "python310-python-memcached-1.59-7.1.noarch.rpm"
RPM_HASH = "43150e2d8eec4cee8c4b464c7c1c3101ef92ca1c2ab49636163297e63e14020fa3dcc2025d55a4c4a578914950757c89d9540445f043b51e58e93f465f7f63a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-memcached python3.10dist(python-memcached) python310-python-memcached python3dist(python-memcached)"
RDEPENDS:${PN} += "memcached python(abi)"

inherit rpm
