SUMMARY = "Bootstrap support for Django projects"
DESCRIPTION = "Bootstrap support for Django projects."
LICENSE = "BSD-3-Clause"

PV = "14.2.0"

RPM_NAME = "python311-django-bootstrap3-14.2.0-2.6.noarch.rpm"
RPM_HASH = "465f8e946b392d6b2145c373ad1fd79965a3d69593caa5be7d2d2ee431305746a0f54d8bc773a3716acf18eab8b1ed563738f5b72c619c8fce0ddb26599d04e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-bootstrap3) python311-django-bootstrap3 python3dist(django-bootstrap3)"
RDEPENDS:${PN} += "python(abi) python311-Django"

inherit rpm
