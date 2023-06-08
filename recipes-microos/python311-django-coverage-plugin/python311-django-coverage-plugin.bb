SUMMARY = "Django template coveragepy plugin"
DESCRIPTION = "Django template coverage.py plugin"
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python311-django-coverage-plugin-3.0.0-2.1.noarch.rpm"
RPM_HASH = "c7cd7052f093dfc4f2313e759836f4cf625e53351e2ca0b26b924e24b4ad66e8a50db0553dc8a0c74cd32b844ac8063a87baf6c29c4d5f83bfafd30d139949a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-coverage-plugin) python311-django-coverage-plugin python311-django_coverage_plugin python3dist(django-coverage-plugin)"
RDEPENDS:${PN} += "python(abi) python311-Django python311-coverage"

inherit rpm
