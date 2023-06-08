SUMMARY = "A WSGI object-dispatching web framework"
DESCRIPTION = "A WSGI object-dispatching web framework."
LICENSE = "BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "python311-pecan-1.4.2-2.5.noarch.rpm"
RPM_HASH = "4cd5432ba9b5c542947486f259af408ad81b56cbe1dff16b373badf2797b430f0153b98367fbc14864673ece997f428291b7d0435fcb17b95b8b7b24e36531a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pecan) python311-pecan python3dist(pecan)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 alts python(abi) python311-Mako python311-WebOb python311-WebTest python311-logutils python311-setuptools python311-six"

inherit rpm
