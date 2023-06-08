SUMMARY = "Python implementation of Jean Meeus astronomical routines"
DESCRIPTION = "PyMeeus is a Python implementation of the astronomical algorithms \
described in the classical book 'Astronomical Algorithms, 2nd Edition, \
Willmann-Bell Inc. (1998)' by Jean Meeus."
LICENSE = "LGPL-3.0-only"

PV = "0.5.12"

RPM_NAME = "python311-PyMeeus-0.5.12-2.1.noarch.rpm"
RPM_HASH = "95569b9bb8e06fd3ecdca98276b981d6d4dbd511abbc2b59e64160f5e46d587c0365459c1c2f69b8d89b0c264122a4ab54c3963347450811aa11870da34b114f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pymeeus) python311-PyMeeus python3dist(pymeeus)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
