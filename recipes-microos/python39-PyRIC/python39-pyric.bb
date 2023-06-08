SUMMARY = "Python Wireless Library"
DESCRIPTION = "PyRIC is a (Linux-only) library providing wireless developers and pentesters the \
ability to identify, enumerate and manipulate their system's wireless cards \
programmatically in Python."
LICENSE = "GPL-3.0-only"

PV = "0.1.6.3"

RPM_NAME = "python39-PyRIC-0.1.6.3-3.14.noarch.rpm"
RPM_HASH = "968141252e3b6dc5cc0f40db47f7a6c88eff4da0757c73987129fef2ae609b06f9af294dc0b71e49cda2ce51c823061901d2edb2d57ff1f61a3d6d37ce4e57ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyric) python39-PyRIC python3dist(pyric)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
