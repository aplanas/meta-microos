SUMMARY = "A redis cache backend for Django"
DESCRIPTION = "A redis cache backend for Django."
LICENSE = "BSD-3-Clause"

PV = "5.2.0"

RPM_NAME = "python39-django-redis-5.2.0-1.4.noarch.rpm"
RPM_HASH = "598549228f1e1c9066011fb525d9107518b2309880f2c782726b2115234709410852123dc75f0ec0ec3acfa3380c62e0e591910d9950dd9f9aa72a7aef303f4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-redis) python39-django-redis python3dist(django-redis)"
RDEPENDS:${PN} += "python(abi) python39-Django python39-lz4 python39-msgpack python39-redis"

inherit rpm
