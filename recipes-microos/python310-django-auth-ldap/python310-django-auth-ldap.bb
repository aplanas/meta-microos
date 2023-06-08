SUMMARY = "Django LDAP authentication backend"
DESCRIPTION = "This is a Django authentication backend that authenticates against an LDAP service. \
Configuration can be as simple as a single distinguished name template, but there \
are many rich configuration options for working with users, groups, and permissions."
LICENSE = "BSD-2-Clause"

PV = "4.0.0"

RPM_NAME = "python310-django-auth-ldap-4.0.0-1.12.noarch.rpm"
RPM_HASH = "c50cb1e4861c85dd99f011821a28cdfe76392b7de68a8bde02db9c593d11bd1337eabf578f438fe3968f676607c60127835fb729982bc0992166c036f344b2f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-auth-ldap python3.10dist(django-auth-ldap) python310-django-auth-ldap python3dist(django-auth-ldap)"
RDEPENDS:${PN} += "python(abi) python310-Django python310-ldap"

inherit rpm
