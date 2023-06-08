SUMMARY = "Authentication for Django REST framework"
DESCRIPTION = "Authentication for Django REST framework."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python39-django-rest-knox-4.2.0-1.7.noarch.rpm"
RPM_HASH = "87523437a7e65338a62b6d3bf400418dc537912a67bb53e15e4ac98fb2f467693fc83b2bfeaad63f008a21e80b9b2cd22eb9d9f5f979fa211c2bdfe1862e7a68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-rest-knox) python39-django-rest-knox python3dist(django-rest-knox)"
RDEPENDS:${PN} += "python(abi) python39-Django python39-cryptography python39-djangorestframework"

inherit rpm
