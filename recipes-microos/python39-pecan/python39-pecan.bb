SUMMARY = "A WSGI object-dispatching web framework"
DESCRIPTION = "A WSGI object-dispatching web framework."
LICENSE = "BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "python39-pecan-1.4.2-2.5.noarch.rpm"
RPM_HASH = "164c78aef5e7f7b6eeed26dee32ae4321e2bb2a729dfebd956c7eb7af8e7376258b5e5adee44a08ca6b1db9f2f4d3c2830e22fe2eb304ee81dfe572b53ab1555"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pecan) python39-pecan python3dist(pecan)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 alts python(abi) python39-Mako python39-WebOb python39-WebTest python39-logutils python39-setuptools python39-six"

inherit rpm
