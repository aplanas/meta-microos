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

RPM_NAME = "python39-djangorestframework-3.14.0-2.3.noarch.rpm"
RPM_HASH = "b115c5fd0016941c5e91f1534b4cf4c65e226b12877092b15fb7c9f29a4a1e20bd7970bfba99e4cd3a7ae35a737eae89ab3b1aa42344237236d1fd3bcc8fa0d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(djangorestframework) \
python39-django-rest-framework \
python39-djangorestframework \
python3dist(djangorestframework)"
RDEPENDS:${PN} += "python(abi) \
python39-Django"

inherit rpm
