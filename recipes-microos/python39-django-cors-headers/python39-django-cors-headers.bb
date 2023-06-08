SUMMARY = "A Django App that adds CORS headers to responses"
DESCRIPTION = "A Django App that adds CORS (Cross-Origin Resource Sharing) headers to \
responses."
LICENSE = "MIT"

PV = "3.13.0"

RPM_NAME = "python39-django-cors-headers-3.13.0-1.3.noarch.rpm"
RPM_HASH = "f09529129de2934dd4c38c06cb9fecb0c6d89904985fafa9646a09ca6af3e8d96a4f674f40b1ec2758b09f7b5a85fe881d6701a2f93ca902092f898ddefc1235"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-cors-headers) python39-django-cors-headers python3dist(django-cors-headers)"
RDEPENDS:${PN} += "python(abi) python39-Django"

inherit rpm
