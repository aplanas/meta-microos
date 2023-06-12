SUMMARY = "Class based template tags for Django"
DESCRIPTION = "This project creates an altnerate way of writing Django template tags \
which is fully compatible with the current Django templating infrastructure."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python39-django-classy-tags-3.0.1-1.3.noarch.rpm"
RPM_HASH = "26d52196b64fa9a352bfb40b3a27058d861837aab4d925b1a5e38745b077b0c11ceb0bae38c60de78c630dfa5b68d82a1fab694f4035a83b5cc660440ed0dd57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-classy-tags) \
python39-django-classy-tags \
python3dist(django-classy-tags)"
RDEPENDS:${PN} += "python(abi) \
python39-Django"

inherit rpm
