SUMMARY = "A WSGI object-dispatching web framework"
DESCRIPTION = "A WSGI object-dispatching web framework."
LICENSE = "BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "python310-pecan-1.4.2-3.1.noarch.rpm"
RPM_HASH = "4860d36908ae75d0c658829168fab39cdcdf1ec9e6963fdc4d190248a8a72b90549f750f0591c76d0438728fa88ace61a6e96f7d65cbab38d7cb8472177dbf7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pecan python3.10dist(pecan) python310-pecan python3dist(pecan)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 alts python(abi) python310-Mako python310-WebOb python310-WebTest python310-logutils python310-setuptools"

inherit rpm
