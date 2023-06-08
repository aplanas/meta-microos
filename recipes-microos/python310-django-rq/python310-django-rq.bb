SUMMARY = "Simple app that provides django integration for RQ (Redis Queue)"
DESCRIPTION = "Django integration with RQ, a Redis based Python queuing library. \
Django-RQ is a simple app that allows you to configure your queues \
in django's settings.py and easily use them in your project."
LICENSE = "MIT"

PV = "2.8.0"

RPM_NAME = "python310-django-rq-2.8.0-1.1.noarch.rpm"
RPM_HASH = "a2da621ef60a2ded9810f03f7828eeaf9747a97102445a358f89e2c6500a9b85baa7669ecbcf9b878af8c308b13e738da22cf9ba383226e27d6d5c7d71b3e023"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-rq python3.10dist(django-rq) python310-django-rq python3dist(django-rq)"
RDEPENDS:${PN} += "python(abi) python310-Django python310-rq"

inherit rpm
