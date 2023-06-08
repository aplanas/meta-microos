SUMMARY = "Profiling for the Django Framework"
DESCRIPTION = "Profiling for the Django Framework."
LICENSE = "MIT"

PV = "5.0.3"

RPM_NAME = "python311-django-silk-5.0.3-1.4.noarch.rpm"
RPM_HASH = "b073e1cbd6c82ed655c870e10e6538374f9cf3a934330b7dca9801cb09a6d5c7732a1b3b11289556e164d4eccdbbf150d50a85e89a5aa6b677691bb2a24a6e92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-silk) python311-django-silk python3dist(django-silk)"
RDEPENDS:${PN} += "python(abi) python311-Django python311-Jinja2 python311-Pillow python311-Pygments python311-autopep8 python311-gprof2dot python311-python-dateutil python311-pytz python311-requests python311-sqlparse"

inherit rpm
