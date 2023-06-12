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

RPM_NAME = "python311-python-memcached-1.59-7.1.noarch.rpm"
RPM_HASH = "b5bb7b3bbd9bd55a3fa4b4d608f62edc3ab92e41810b3b03fabb17bf4f610732222159def4d53cbd77136c98415b9c697fdb9cf98d1a1c61722b14af318a7bb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-memcached) python311-python-memcached python3dist(python-memcached)"
RDEPENDS:${PN} += "memcached python(abi)"

inherit rpm
