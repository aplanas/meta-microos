SUMMARY = "Python Social Authentication, Django integration"
DESCRIPTION = "This is the Django component of the python-social-auth ecosystem, \
it implements the needed functionality to integrate social-auth-core \
in a Django based project."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "python311-social-auth-app-django-5.0.0-3.2.noarch.rpm"
RPM_HASH = "506c86c5b62bf7819a4673e133c5241aa8d2b7fc719d6cb9f0e7603f99e51c8374fa2a25714e6348218ae793cee7a93e0a69f06c27d1e16c74847c99a253ef78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(social-auth-app-django) \
python311-social-auth-app-django \
python3dist(social-auth-app-django)"
RDEPENDS:${PN} += "python(abi) \
python311-Django \
python311-python-jose \
python311-social-auth-core"

inherit rpm
