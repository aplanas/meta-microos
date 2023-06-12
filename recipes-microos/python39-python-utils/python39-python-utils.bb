SUMMARY = "Utilities not included with the standard Python install"
DESCRIPTION = "Python Utils is a collection of Python functions and \
classes which make common patterns shorter and easier."
LICENSE = "BSD-3-Clause"

PV = "3.4.5"

RPM_NAME = "python39-python-utils-3.4.5-1.3.noarch.rpm"
RPM_HASH = "31a292795de7b13fcb33e8f90287482ea7feae645da1791b7b4eca8bcac820cda109ff9abe26e8bf18fd62731b8d39c5d09965c5690c7a22cffa1166c59af528"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-utils) \
python39-python-utils \
python3dist(python-utils)"
RDEPENDS:${PN} += "python(abi) \
python39-loguru"

inherit rpm
