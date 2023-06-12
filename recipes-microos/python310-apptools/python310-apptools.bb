SUMMARY = "Application tools in Python"
DESCRIPTION = "The apptools project includes a set of packages that Enthought has found \
useful in creating a number of applications.  They implement functionality \
that is commonly needed by many applications. \
 \
Part of the Enthought Tool Suite (ETS)."
LICENSE = "BSD-3-Clause & LGPL-2.1-only & LGPL-3.0-only"

PV = "5.2.0"

RPM_NAME = "python310-apptools-5.2.0-1.3.noarch.rpm"
RPM_HASH = "10cb379a6251d1542caf3add6285495e652406c6182e68c5af895ec3210c5f17f2a42c93002bd9423b148d1cabbe62af1962bf7e7e761932b3e5ae6fb9b0b9fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-apptools \
python3.10dist(apptools) \
python310-apptools \
python3dist(apptools)"
RDEPENDS:${PN} += "python(abi) \
python310-configobj \
python310-traits"

inherit rpm
