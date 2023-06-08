SUMMARY = "Gravatar Support for Django"
DESCRIPTION = "Essential Gravatar support for Django. Features helper methods, templatetags and a full test suite!"
LICENSE = "MIT"

PV = "1.4.4"

RPM_NAME = "python311-django-gravatar2-1.4.4-2.6.noarch.rpm"
RPM_HASH = "c2be68286d049e89a9026994bbc18d9a8904aa3a75dfc36026686c8e81a4451c8315a87db059682e08f6ef33e69e8f7dd6da120721eba1c24f28bc2a757814f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-gravatar2) python311-django-gravatar2 python3dist(django-gravatar2)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
