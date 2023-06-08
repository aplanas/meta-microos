SUMMARY = "Python library for Bugzilla"
DESCRIPTION = "This is a Python module that provides a Python-ish interface to \
Bugzilla over XMLRPC. It supports the Web Services provided by \
upstream Bugzilla 3.0 and 3.2. \
 \
It also includes a 'bugzilla' commandline client which can be used for quick, \
ad-hoc bugzilla jiggery-pokery."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.0"

RPM_NAME = "python310-bugzilla-3.2.0-1.4.noarch.rpm"
RPM_HASH = "542ac671e55ea0ae14c3875eb53ee7be73544320bc45f67e11bf860e4431da6a441abbc750d69cb5148f14a712c6ba21a628b70a8d858df9c19237f963dc4682"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bugzilla python3.10dist(python-bugzilla) python310-bugzilla python3dist(python-bugzilla)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-requests update-alternatives"

inherit rpm
