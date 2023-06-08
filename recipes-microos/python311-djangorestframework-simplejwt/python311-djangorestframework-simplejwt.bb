SUMMARY = "JSON Web Token authentication for Django REST Framework"
DESCRIPTION = "A minimal JSON Web Token authentication plugin for the Django REST Framework."
LICENSE = "MIT"

PV = "4.6.0"

RPM_NAME = "python311-djangorestframework-simplejwt-4.6.0-1.10.noarch.rpm"
RPM_HASH = "d38a1356381cb7a4128f5e6fb0691636287b8fc8c2694ba081653d5ce9356b95c60aad9608bcceb7800b820e0b454a3bb70c63fd03a6c9a88b2c626b0ea7e502"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(djangorestframework-simplejwt) python311-djangorestframework-simplejwt python3dist(djangorestframework-simplejwt)"
RDEPENDS:${PN} += "python(abi) python311-PyJWT python311-djangorestframework"

inherit rpm
