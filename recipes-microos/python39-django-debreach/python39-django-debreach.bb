SUMMARY = "Middleware to protect against the BREACH attack in Django"
DESCRIPTION = "Adds middleware and context processors to give some protection against the BREACH attack in Django."
LICENSE = "BSD-2-Clause"

PV = "2.1.0"

RPM_NAME = "python39-django-debreach-2.1.0-1.13.noarch.rpm"
RPM_HASH = "28113d2b86662a8c5a57d7cc74dacab0f18e9ce0cf0bcee3b510e0b0dfef856f372241170cbb922e9972d5967b1e80d7f075a0fd3b87ee5c098bfb4581efc1a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-debreach) \
python39-django-debreach \
python3dist(django-debreach)"
RDEPENDS:${PN} += "python(abi) \
python39-Django"

inherit rpm
