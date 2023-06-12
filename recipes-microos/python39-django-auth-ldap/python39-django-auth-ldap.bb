SUMMARY = "Django LDAP authentication backend"
DESCRIPTION = "This is a Django authentication backend that authenticates against an LDAP service. \
Configuration can be as simple as a single distinguished name template, but there \
are many rich configuration options for working with users, groups, and permissions."
LICENSE = "BSD-2-Clause"

PV = "4.0.0"

RPM_NAME = "python39-django-auth-ldap-4.0.0-1.12.noarch.rpm"
RPM_HASH = "95f67ffc9d8713a542e407f1d6ea2245637975e3450b2500c8ae8a41c33245d0663276b3ece2f5ee4bea6dae5b0cf0c176aa689780f04db02520d2666d2ff8ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-auth-ldap) \
python39-django-auth-ldap \
python3dist(django-auth-ldap)"
RDEPENDS:${PN} += "python(abi) \
python39-Django \
python39-ldap"

inherit rpm
