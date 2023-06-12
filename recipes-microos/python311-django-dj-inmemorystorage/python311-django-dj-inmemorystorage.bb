SUMMARY = "A non-persistent in-memory data storage backend for Django"
DESCRIPTION = "An in-memory data storage backend for Django. \
 \
Compatible with Django's storage API."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python311-django-dj-inmemorystorage-2.1.0-4.6.noarch.rpm"
RPM_HASH = "43965750946e72524978f70431299ff7adeca652c478abb409dc955c2a99a388414130fecb0f1bab193c23bbbb2cec531d277cc62497ec3e8fd566527b4c3243"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(dj-inmemorystorage) \
python311-django-dj-inmemorystorage \
python3dist(dj-inmemorystorage)"
RDEPENDS:${PN} += "python(abi) \
python311-Django \
python311-six"

inherit rpm
