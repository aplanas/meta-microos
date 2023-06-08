SUMMARY = "Profiling for the Django Framework"
DESCRIPTION = "Profiling for the Django Framework."
LICENSE = "MIT"

PV = "5.0.3"

RPM_NAME = "python310-django-silk-5.0.3-1.4.noarch.rpm"
RPM_HASH = "fe0565af4d107307ff6144f43c8ea2553a1745597ba5392363a3d6499e28702fb6a1d6bc47c37e8315bf608e4ae7d4879ffe1fca0d9892702cfc119110a75361"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-silk python3.10dist(django-silk) python310-django-silk python3dist(django-silk)"
RDEPENDS:${PN} += "python(abi) python310-Django python310-Jinja2 python310-Pillow python310-Pygments python310-autopep8 python310-gprof2dot python310-python-dateutil python310-pytz python310-requests python310-sqlparse"

inherit rpm
