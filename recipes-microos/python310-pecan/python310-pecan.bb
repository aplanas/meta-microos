SUMMARY = "A WSGI object-dispatching web framework"
DESCRIPTION = "A WSGI object-dispatching web framework."
LICENSE = "BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "python310-pecan-1.4.2-2.5.noarch.rpm"
RPM_HASH = "b0c043c6e5debc4836d0f40023681d7dbb36991909dd38d3802e280d0dd8ddb14be485c8af5189fbe545b912390b245357dd120c224b57748b0854e6554fda1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pecan python3.10dist(pecan) python310-pecan python3dist(pecan)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 alts python(abi) python310-Mako python310-WebOb python310-WebTest python310-logutils python310-setuptools python310-six"

inherit rpm
