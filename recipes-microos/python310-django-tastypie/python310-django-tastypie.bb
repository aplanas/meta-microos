SUMMARY = "A webservice API framework layer for Django"
DESCRIPTION = "Tastypie is a webservice API framework for Django. It provides a \
customizable abstraction for creating REST-style interfaces."
LICENSE = "BSD-3-Clause"

PV = "0.14.5"

RPM_NAME = "python310-django-tastypie-0.14.5-1.4.noarch.rpm"
RPM_HASH = "853cc38ba1a5eb273ce006fd29a7f63203ba6115ea482e5bb6b0353b8d79606de5125ccf25a33c971e4057ded038d42e94b2f271e1c268c5d9ae0c258604d769"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-tastypie python3.10dist(django-tastypie) python310-django-tastypie python3dist(django-tastypie)"
RDEPENDS:${PN} += "python(abi) python310-Django python310-python-dateutil python310-python-mimeparse"

inherit rpm
