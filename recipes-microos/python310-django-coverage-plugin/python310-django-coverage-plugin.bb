SUMMARY = "Django template coveragepy plugin"
DESCRIPTION = "Django template coverage.py plugin"
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python310-django-coverage-plugin-3.0.0-2.1.noarch.rpm"
RPM_HASH = "a9279aa7118042c36c5533432bec59066f06d41955bd5cb30cac596df6c8530d6f869aac1b68d30069fcff1d5fe5dcac47568b96f811d95275a11df93278bfc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-coverage-plugin \
python3-django_coverage_plugin \
python3.10dist(django-coverage-plugin) \
python310-django-coverage-plugin \
python310-django_coverage_plugin \
python3dist(django-coverage-plugin)"
RDEPENDS:${PN} += "python(abi) \
python310-Django \
python310-coverage"

inherit rpm
