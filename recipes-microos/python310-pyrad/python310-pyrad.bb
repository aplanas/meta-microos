SUMMARY = "RADIUS tools"
DESCRIPTION = "pyrad is an implementation of a RADIUS client/server as described in RFC2865. \
It takes care of all the details like building RADIUS packets, sending \
them and decoding responses."
LICENSE = "BSD-3-Clause"

PV = "2.4"

RPM_NAME = "python310-pyrad-2.4-3.8.noarch.rpm"
RPM_HASH = "d1237b4efb1c7faf5ec41a97d638d6753f05659dfb79702d820317026b34ec1e1a5949eeb1eed62addf7f53906dfef542093696d8d48d50857165232e775a47f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyrad \
python3.10dist(pyrad) \
python310-pyrad \
python3dist(pyrad)"
RDEPENDS:${PN} += "python(abi) \
python310-six"

inherit rpm
