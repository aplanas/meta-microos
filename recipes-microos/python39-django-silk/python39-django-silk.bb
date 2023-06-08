SUMMARY = "Profiling for the Django Framework"
DESCRIPTION = "Profiling for the Django Framework."
LICENSE = "MIT"

PV = "5.0.3"

RPM_NAME = "python39-django-silk-5.0.3-1.4.noarch.rpm"
RPM_HASH = "8c115ccab1bc54a8cb11314fbcf4d47d7f52b68479a25ca5da7ea8add019d7339145cb0e8c4a9ec43b15bd0ceb373e273e7139664d02a5bf72d17be7cdd78f19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-silk) python39-django-silk python3dist(django-silk)"
RDEPENDS:${PN} += "python(abi) python39-Django python39-Jinja2 python39-Pillow python39-Pygments python39-autopep8 python39-gprof2dot python39-python-dateutil python39-pytz python39-requests python39-sqlparse"

inherit rpm
