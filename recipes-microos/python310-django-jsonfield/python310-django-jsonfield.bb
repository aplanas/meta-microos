SUMMARY = "A reusable Django field to store validated JSON"
DESCRIPTION = "Django-jsonfield is a reusable Django field that allows you to \
store validated JSON in your model."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python310-django-jsonfield-3.1.0-3.6.noarch.rpm"
RPM_HASH = "1453c691430db762a2d6198728639987ce7b258dfb78c6b46a6e44b63fba4ccb6e6f29d565219ea3a8ece567686206974895019c6f9a6f8fe20e457d588088d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-jsonfield python3.10dist(jsonfield) python310-django-jsonfield python3dist(jsonfield)"
RDEPENDS:${PN} += "python(abi) python310-Django"

inherit rpm
