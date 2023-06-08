SUMMARY = "Django ORM cache with automatic granular event-driven invalidation"
DESCRIPTION = "A slick app that supports automatic or manual queryset caching and automatic \
granular event-driven invalidation. \
 \
It uses `redis <http://redis.io/>`_ as backend for ORM cache and redis or \
filesystem for simple time-invalidated one."
LICENSE = "BSD-3-Clause"

PV = "7.0"

RPM_NAME = "python311-django-cacheops-7.0-1.1.noarch.rpm"
RPM_HASH = "a54b3f751e61697e5a36347bb0d643018a4822cecfccddf163de393d4471c077be0aa6892320824d86648e5a367be06a89f3921a1faef5f7ad87ad10bd5974d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-cacheops) python311-django-cacheops python3dist(django-cacheops)"
RDEPENDS:${PN} += "python(abi) python311-django python311-funcy python311-redis"

inherit rpm
