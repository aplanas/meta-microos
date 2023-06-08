SUMMARY = "Python Social Authentication, Django integration"
DESCRIPTION = "This is the Django component of the python-social-auth ecosystem, \
it implements the needed functionality to integrate social-auth-core \
in a Django based project."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "python39-social-auth-app-django-5.0.0-3.2.noarch.rpm"
RPM_HASH = "ebfed20e4a6ab2bcd4120bdb16b7dcfd6e4d7caa99c45c0a9e29bc286eeedadd2a9b330c689bf831554529418cbc51ed20aefdded43a1bf712ca1d2154afb77a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(social-auth-app-django) python39-social-auth-app-django python3dist(social-auth-app-django)"
RDEPENDS:${PN} += "python(abi) python39-Django python39-python-jose python39-social-auth-core"

inherit rpm
