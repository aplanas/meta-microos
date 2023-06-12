SUMMARY = "Python Social Authentication, Django integration"
DESCRIPTION = "This is the Django component of the python-social-auth ecosystem, \
it implements the needed functionality to integrate social-auth-core \
in a Django based project."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "python310-social-auth-app-django-5.0.0-3.2.noarch.rpm"
RPM_HASH = "6c3f170293fe477820e701a47f1890be68f71a8805bf33023ef40b62e9d315208ea5411861691ead66d3dd390cb5dbebebc8e3d037c853d288c5a55f0b4c98f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-social-auth-app-django \
python3.10dist(social-auth-app-django) \
python310-social-auth-app-django \
python3dist(social-auth-app-django)"
RDEPENDS:${PN} += "python(abi) \
python310-Django \
python310-python-jose \
python310-social-auth-core"

inherit rpm
