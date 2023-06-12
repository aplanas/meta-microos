SUMMARY = "A set of high-level abstractions for Django forms"
DESCRIPTION = "Django's 'formtools' is a set of high-level abstractions for Django forms. \
Currently for form previews and multi-step forms."
LICENSE = "BSD-3-Clause"

PV = "2.4.1"

RPM_NAME = "python311-django-formtools-2.4.1-1.1.noarch.rpm"
RPM_HASH = "a1bd291edb7aa4850fbff40713bbd40781b5e399d9b93a90e9b38e3d4219f4e93baaf3fdafe5217be506b85e188ef429bc1706b99e416c5cf0eccb9c4166c8d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-formtools) python311-django-formtools python3dist(django-formtools)"
RDEPENDS:${PN} += "python(abi) python311-Django"

inherit rpm
