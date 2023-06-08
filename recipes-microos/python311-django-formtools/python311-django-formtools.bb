SUMMARY = "A set of high-level abstractions for Django forms"
DESCRIPTION = "Django's 'formtools' is a set of high-level abstractions for Django forms. \
Currently for form previews and multi-step forms."
LICENSE = "BSD-3-Clause"

PV = "2.4"

RPM_NAME = "python311-django-formtools-2.4-1.3.noarch.rpm"
RPM_HASH = "a7afc116a5852f81a537e717493b7894f9a6e0484eb1b881c5748269aae712ba89cbd21b0d9330c16a2ab10a4ea0e8464fe9d7d53baf6238c24d2490072c0f9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-formtools) python311-django-formtools python3dist(django-formtools)"
RDEPENDS:${PN} += "python(abi) python311-Django"

inherit rpm
