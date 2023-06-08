SUMMARY = "A Python implementation of the actor model"
DESCRIPTION = "Pykka is a Python implementation of the `actor model \
<http://en.wikipedia.org/wiki/Actor_model>`_. The actor model introduces some \
rules to control the sharing of state and cooperation between execution \
units, with which one can build concurrent applications."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "python311-pykka-3.1.1-1.9.noarch.rpm"
RPM_HASH = "897df36b7aff433b1e9f90d8bf5b3e333e8444def1bca5c4fa15229ffdd683c367e53775e6f3d981581c4ec702124286110b41e7713e0e57cd7f6e99725df651"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pykka) python311-Pykka python311-pykka python3dist(pykka)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
