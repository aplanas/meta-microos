SUMMARY = "A redis cache backend for Django"
DESCRIPTION = "A redis cache backend for Django."
LICENSE = "BSD-3-Clause"

PV = "5.2.0"

RPM_NAME = "python311-django-redis-5.2.0-1.4.noarch.rpm"
RPM_HASH = "bc9e03ab5f455aa4f9c6c0c56abc65d2aaf4adb3117d15934e309474caef0d572cbfdce44e6c409c62487aaddc88039fa5de0502ed911c0e5834b1379f65dfd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-redis) python311-django-redis python3dist(django-redis)"
RDEPENDS:${PN} += "python(abi) python311-Django python311-lz4 python311-msgpack python311-redis"

inherit rpm
