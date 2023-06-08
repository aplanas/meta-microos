SUMMARY = "Bind to an ephemeral port, force it into the TIME_WAIT state, and unbind it"
DESCRIPTION = "Bind to an ephemeral port, force it into the TIME_WAIT state, and unbind it."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python39-ephemeral-port-reserve-1.1.4-2.1.noarch.rpm"
RPM_HASH = "d7620ff45a29a96708277d245edfca1337b5a7bf102b7dacb70f63d9f0b4a0b0e19cad7778d57363dc0596b596236910f0fb23a26d459c820a26be991c232638"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ephemeral-port-reserve) python39-ephemeral-port-reserve python3dist(ephemeral-port-reserve)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) update-alternatives"

inherit rpm
