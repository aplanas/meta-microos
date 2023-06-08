SUMMARY = "Jinja2 templating language integrated in Django"
DESCRIPTION = "Simple and nonobstructive jinja2 integration with Django."
LICENSE = "BSD-3-Clause"

PV = "2.10.2"

RPM_NAME = "python39-django-jinja-2.10.2-1.3.noarch.rpm"
RPM_HASH = "7e4f7a68bd2b733f4c40cdb07a34d427ce3ae7edc099f6956db37f2db93b4e007ebf8dc8cd10d51f976e7094b9dfa1c3058acbf7c5d677cf21504329dd20e572"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-jinja) python39-django-jinja python3dist(django-jinja)"
RDEPENDS:${PN} += "python(abi) python39-Django python39-Jinja2"

inherit rpm
