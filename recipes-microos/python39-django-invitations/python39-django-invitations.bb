SUMMARY = "Generic invitations app with support for Django-allauth"
DESCRIPTION = "Generic invitations app with support for Django-allauth."
LICENSE = "GPL-3.0-only"

PV = "1.9.3"

RPM_NAME = "python39-django-invitations-1.9.3-3.5.noarch.rpm"
RPM_HASH = "ab45e7ceaffe195926a60671d8c165ee7f9b784b4fa4bed20bec32934162771db41c8e1cd684f5c5c771b2ddc8f776edd7f820c30535b17a9d93bd54a275e5a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-invitations) \
python39-django-invitations \
python3dist(django-invitations)"
RDEPENDS:${PN} += "python(abi) \
python39-Django"

inherit rpm
