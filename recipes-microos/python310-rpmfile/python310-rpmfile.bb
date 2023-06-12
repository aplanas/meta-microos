SUMMARY = "Python module to read rpm files"
DESCRIPTION = "Tools for inspecting RPM files in python. This module is modeled after the tarfile module."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "python310-rpmfile-1.0.4-1.12.noarch.rpm"
RPM_HASH = "b45d0f1f6d033d5b6d3b681ac086d1b2df5d766fa5e93844127a1eb5f9b2789c72f4395ee569cc09e72d10de3678a95eb0cb3eefc1d91b4f74ac6e752c8dcca9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rpmfile \
python3.10dist(rpmfile) \
python310-rpmfile \
python3dist(rpmfile)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
