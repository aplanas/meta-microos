SUMMARY = "RADIUS tools"
DESCRIPTION = "pyrad is an implementation of a RADIUS client/server as described in RFC2865. \
It takes care of all the details like building RADIUS packets, sending \
them and decoding responses."
LICENSE = "BSD-3-Clause"

PV = "2.4"

RPM_NAME = "python39-pyrad-2.4-3.8.noarch.rpm"
RPM_HASH = "d0bd4ee160a59a596e4301cc6662999534d34eba1f4465f5ac2468dfc8def5de4fe0e43dc6e9c9539860fc80efb83f37b039005b73ef329127742c4d29c446ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyrad) \
python39-pyrad \
python3dist(pyrad)"
RDEPENDS:${PN} += "python(abi) \
python39-six"

inherit rpm
