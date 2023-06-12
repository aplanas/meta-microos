SUMMARY = "A set of high-level abstractions for Django forms"
DESCRIPTION = "Django's 'formtools' is a set of high-level abstractions for Django forms. \
Currently for form previews and multi-step forms."
LICENSE = "BSD-3-Clause"

PV = "2.4.1"

RPM_NAME = "python39-django-formtools-2.4.1-1.1.noarch.rpm"
RPM_HASH = "4283ac1d45ad71f5a2045535eb11f4393b67e9259ec22169e74771c1e06908c92e495fc16db29c690197575c5f2ed7d1a21d210965771ccb26183f74329954c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-formtools) python39-django-formtools python3dist(django-formtools)"
RDEPENDS:${PN} += "python(abi) python39-Django"

inherit rpm
