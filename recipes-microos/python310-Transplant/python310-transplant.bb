SUMMARY = "Python module for calling out to Matlab"
DESCRIPTION = "Transplant is a way of calling Matlab from Python. \
 \
Python lists are converted to cell arrays in Matlab, dicts are \
converted to Maps, and numpy ND-Arrays are converted to native \
Matlab matrices. \
 \
All Matlab functions and objects can be accessed from Python."
LICENSE = "BSD-3-Clause"

PV = "0.8.11"

RPM_NAME = "python310-Transplant-0.8.11-3.7.noarch.rpm"
RPM_HASH = "e7d828c12fbce37cedfa1987c2cfa04ef7fb8af8b20b6fcf1aec73b102eabba9fc4bf9c850942ebd85d562a66567c1ade9d654468428de8785c41dc772c55183"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Transplant python3.10dist(transplant) python310-Transplant python3dist(transplant)"
RDEPENDS:${PN} += "python(abi) python310-msgpack-python python310-numpy python310-pyzmq"

inherit rpm
