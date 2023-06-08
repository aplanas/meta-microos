SUMMARY = "Python interface to OGC Web Services"
DESCRIPTION = "OWSLib is a Python package for client programming with Open Geospatial \
Consortium (OGC) web service (hence OWS) interface standards, and their \
related content models."
LICENSE = "BSD-3-Clause"

PV = "0.28.1"

RPM_NAME = "python39-OWSLib-0.28.1-1.2.noarch.rpm"
RPM_HASH = "7ece94e7929155d2475ceed43ecb4218c172443ff817b728beeca3b8f0fdbc9f09ed64a7e6fa6b71e2f1780d617c0f46d46c6017307b150218d1f04aed7e238f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(owslib) python39-OWSLib python39-owslib python3dist(owslib)"
RDEPENDS:${PN} += "python(abi) python39-PyYAML python39-lxml python39-python-dateutil python39-pytz python39-requests"

inherit rpm
