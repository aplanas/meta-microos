SUMMARY = "A REST Framework for Django"
DESCRIPTION = "Django REST framework is a library for building Web APIs. It is \
modular and the architecture can be customized, based on Django's \
class based views. \
 \
Web APIs built using REST framework are fully self-describing and web \
browseable. It also supports a wide range of media types, \
authentication and permission policies out of the box."
LICENSE = "BSD-2-Clause"

PV = "3.14.0"

RPM_NAME = "python311-djangorestframework-3.14.0-2.3.noarch.rpm"
RPM_HASH = "215ac8fc5fd90d07681f5d8096d37d90875fb54ea540fbd092fc7b481be56ff61940e73b7af4d539407c7336e5b8c9210b84f7fea59203f828403ed95d51f909"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(djangorestframework) \
python311-django-rest-framework \
python311-djangorestframework \
python3dist(djangorestframework)"
RDEPENDS:${PN} += "python(abi) \
python311-Django"

inherit rpm
