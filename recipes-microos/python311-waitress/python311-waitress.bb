SUMMARY = "Waitress WSGI server"
DESCRIPTION = "Waitress is a pure-Python WSGI server. It has no dependencies except \
ones which live in the Python standard library. It supports HTTP/1.0 \
and HTTP/1.1. \
 \
For more information, see the 'docs' directory of the Waitress package or \
http://docs.pylonsproject.org/projects/waitress/en/latest/ ."
LICENSE = "ZPL-2.1"

PV = "2.1.2"

RPM_NAME = "python311-waitress-2.1.2-4.1.noarch.rpm"
RPM_HASH = "9b3255e7dd91b070cbf35df7c70a8db00ea78b48d91e4180f9b42ef6bbdb19a01ed763e159da43c8e002431c91013a1b7c848feaf576eac18d3d357bb07f9272"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(waitress) python311-waitress python3dist(waitress)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 alts python(abi)"

inherit rpm
