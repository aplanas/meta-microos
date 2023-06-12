SUMMARY = "Middleware to protect against the BREACH attack in Django"
DESCRIPTION = "Adds middleware and context processors to give some protection against the BREACH attack in Django."
LICENSE = "BSD-2-Clause"

PV = "2.1.0"

RPM_NAME = "python310-django-debreach-2.1.0-1.13.noarch.rpm"
RPM_HASH = "9284ead6ac2b95c8503348f60d8eb5a32c4adacc19e84c2e9ae0d0cb25b80b53f3e884a7a05d5f49ee063b2ecffd58dfaa872b15bd59453db264565dbb2b79f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-debreach \
python3.10dist(django-debreach) \
python310-django-debreach \
python3dist(django-debreach)"
RDEPENDS:${PN} += "python(abi) \
python310-Django"

inherit rpm
