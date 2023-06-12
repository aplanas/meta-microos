SUMMARY = "A Python implementation of the actor model"
DESCRIPTION = "Pykka is a Python implementation of the `actor model \
<http://en.wikipedia.org/wiki/Actor_model>`_. The actor model introduces some \
rules to control the sharing of state and cooperation between execution \
units, with which one can build concurrent applications."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "python310-pykka-3.1.1-1.9.noarch.rpm"
RPM_HASH = "4f8db7b6ae605396424efa23d5f0d166cc52745fde4c5b30ec144eaaf1e2f25a71d28c22953f8bd9e8eac80176dfb66ee97c87348db0625a946811de4ef86bed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Pykka \
python3-pykka \
python3.10dist(pykka) \
python310-Pykka \
python310-pykka \
python3dist(pykka)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
