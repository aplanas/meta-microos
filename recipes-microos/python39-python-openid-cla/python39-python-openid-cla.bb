SUMMARY = "CLA extension for python-openid"
DESCRIPTION = "CLA extension implementation for python-openid."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "python39-python-openid-cla-1.2-1.18.noarch.rpm"
RPM_HASH = "b40e8a3e7dab3e19b230c04163c8b898e2cd286f82cdb3ab33259c40bbd05e76de2c43b6ed022b8315f5f4605fe9a9d544c6c85dd64912465e95ab79ef031bc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-openid-cla) \
python39-python-openid-cla \
python3dist(python-openid-cla)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
