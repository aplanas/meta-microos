SUMMARY = "Gravatar Support for Django"
DESCRIPTION = "Essential Gravatar support for Django. Features helper methods, templatetags and a full test suite!"
LICENSE = "MIT"

PV = "1.4.4"

RPM_NAME = "python310-django-gravatar2-1.4.4-2.6.noarch.rpm"
RPM_HASH = "b233688c4d4c66a19d4a745fe2ba110219a48331043c134a65b8db4aacaca8c81a81d32a18fdb275ed67943a1e939b71d61ef6be68a9deabc98367bcde8cc600"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-gravatar2 \
python3.10dist(django-gravatar2) \
python310-django-gravatar2 \
python3dist(django-gravatar2)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
