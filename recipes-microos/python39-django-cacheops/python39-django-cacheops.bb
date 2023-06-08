SUMMARY = "Django ORM cache with automatic granular event-driven invalidation"
DESCRIPTION = "A slick app that supports automatic or manual queryset caching and automatic \
granular event-driven invalidation. \
 \
It uses `redis <http://redis.io/>`_ as backend for ORM cache and redis or \
filesystem for simple time-invalidated one."
LICENSE = "BSD-3-Clause"

PV = "7.0"

RPM_NAME = "python39-django-cacheops-7.0-1.1.noarch.rpm"
RPM_HASH = "e2a7b1293ed1a9500a09ec28a0671caea49c07d9714c233753857eca0d013258ac773003fec870747a287bfe8817a37552e3d33de8a647b8b2b36397d4fad718"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-cacheops) python39-django-cacheops python3dist(django-cacheops)"
RDEPENDS:${PN} += "python(abi) python39-django python39-funcy python39-redis"

inherit rpm
