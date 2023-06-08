SUMMARY = "JSON Web Token authentication for Django REST Framework"
DESCRIPTION = "A minimal JSON Web Token authentication plugin for the Django REST Framework."
LICENSE = "MIT"

PV = "4.6.0"

RPM_NAME = "python310-djangorestframework-simplejwt-4.6.0-1.10.noarch.rpm"
RPM_HASH = "2544dcba4019a31b329b7aa8937cdc24fb7f8d08175c2f1c0ec936ab7aa3563261f6d7ab5c381e9fedb0bda3f0750a32de2b5bd82bfa4b64cf8847387c248e42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-djangorestframework-simplejwt python3.10dist(djangorestframework-simplejwt) python310-djangorestframework-simplejwt python3dist(djangorestframework-simplejwt)"
RDEPENDS:${PN} += "python(abi) python310-PyJWT python310-djangorestframework"

inherit rpm
