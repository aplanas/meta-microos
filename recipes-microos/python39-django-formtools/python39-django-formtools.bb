SUMMARY = "A set of high-level abstractions for Django forms"
DESCRIPTION = "Django's 'formtools' is a set of high-level abstractions for Django forms. \
Currently for form previews and multi-step forms."
LICENSE = "BSD-3-Clause"

PV = "2.4"

RPM_NAME = "python39-django-formtools-2.4-1.3.noarch.rpm"
RPM_HASH = "3db7242b03f20b69b606e322012b348b1098680c4d819c8700a3254c01012f6496ea1fc7251417e1090a10c80ee59086fb17728e797bd75b01192ec6542bd1ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-formtools) python39-django-formtools python3dist(django-formtools)"
RDEPENDS:${PN} += "python(abi) python39-Django"

inherit rpm
