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

RPM_NAME = "python311-Transplant-0.8.11-3.7.noarch.rpm"
RPM_HASH = "97e2039fe7082dc878e60c2c60931098223672d9a858466745e9adbba1156a8eeeb5f30444259a3383b6b728fb13055528d2f27fd1c11c6bf59b3363f2787a7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(transplant) python311-Transplant python3dist(transplant)"
RDEPENDS:${PN} += "python(abi) python311-msgpack-python python311-numpy python311-pyzmq"

inherit rpm
