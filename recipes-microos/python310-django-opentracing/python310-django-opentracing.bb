SUMMARY = "OpenTracing support for Django applications"
DESCRIPTION = "OpenTracing support for Django applications."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python310-django-opentracing-1.1.0-2.4.noarch.rpm"
RPM_HASH = "be8a50fa941d0c648d637f93e734b56e95514805b8095cb661b9b9b79b65b467f359612a990902362b7d00d5885e909e4029b8215442ccbd6146207fae786595"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-opentracing python3.10dist(django-opentracing) python310-django-opentracing python3dist(django-opentracing)"
RDEPENDS:${PN} += "python(abi) python310-Django python310-opentracing python310-six"

inherit rpm
