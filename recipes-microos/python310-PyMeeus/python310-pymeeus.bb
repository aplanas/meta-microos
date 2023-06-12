SUMMARY = "Python implementation of Jean Meeus astronomical routines"
DESCRIPTION = "PyMeeus is a Python implementation of the astronomical algorithms \
described in the classical book 'Astronomical Algorithms, 2nd Edition, \
Willmann-Bell Inc. (1998)' by Jean Meeus."
LICENSE = "LGPL-3.0-only"

PV = "0.5.12"

RPM_NAME = "python310-PyMeeus-0.5.12-2.1.noarch.rpm"
RPM_HASH = "e49ab3bf05078905971cf378f40fdb94ca485962e1f2dc644d02b20726e617f2f1353f94118d49ea2a08a9541f1e0089c49adc3af0602e48bca1133e805bbbc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyMeeus \
python3.10dist(pymeeus) \
python310-PyMeeus \
python3dist(pymeeus)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
