SUMMARY = "A set of high-level abstractions for Django forms"
DESCRIPTION = "Django's 'formtools' is a set of high-level abstractions for Django forms. \
Currently for form previews and multi-step forms."
LICENSE = "BSD-3-Clause"

PV = "2.4"

RPM_NAME = "python310-django-formtools-2.4-1.3.noarch.rpm"
RPM_HASH = "4a9d3fbef18e8779fa3a03cf74767d4d78760de2f053c96ab82339c9a187c51872e85fa0b7821c6220b99f96909e65077241482ef02ae404e575d494f413bfd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-formtools python3.10dist(django-formtools) python310-django-formtools python3dist(django-formtools)"
RDEPENDS:${PN} += "python(abi) python310-Django"

inherit rpm
