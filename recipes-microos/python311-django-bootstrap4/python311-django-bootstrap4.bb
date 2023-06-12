SUMMARY = "Bootstrap support for Django projects"
DESCRIPTION = "Bootstrap support for Django projects."
LICENSE = "BSD-3-Clause"

PV = "21.2"

RPM_NAME = "python311-django-bootstrap4-21.2-1.11.noarch.rpm"
RPM_HASH = "c118c48726ab13fc88279f34a51c5dc161a2403429b5ec8f10e5e56485b8bc70cba18581a7cff31373da00ea2ef65391b12b63dc17e5735f5d8120153c9f9ec2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-bootstrap4) \
python311-django-bootstrap4 \
python3dist(django-bootstrap4)"
RDEPENDS:${PN} += "python(abi) \
python311-Django \
python311-beautifulsoup4"

inherit rpm
