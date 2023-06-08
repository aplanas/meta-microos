SUMMARY = "Polymorphic inheritance for Django models"
DESCRIPTION = "Seamless polymorphic inheritance for Django models."
LICENSE = "BSD-3-Clause"

PV = "3.1"

RPM_NAME = "python39-django-polymorphic-3.1-2.6.noarch.rpm"
RPM_HASH = "39f35b6957957d52d1b90885b3597708dd839b2aaa930e3b5b4f3c775aedb94d4d34a9a896f90008d73653f3536a1c70e9145b052dcb32be0c1f26f3716aeceb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-polymorphic) python39-django-polymorphic python3dist(django-polymorphic)"
RDEPENDS:${PN} += "python(abi) python39-Django"

inherit rpm
