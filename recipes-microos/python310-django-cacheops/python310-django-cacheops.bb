SUMMARY = "Django ORM cache with automatic granular event-driven invalidation"
DESCRIPTION = "A slick app that supports automatic or manual queryset caching and automatic \
granular event-driven invalidation. \
 \
It uses `redis <http://redis.io/>`_ as backend for ORM cache and redis or \
filesystem for simple time-invalidated one."
LICENSE = "BSD-3-Clause"

PV = "7.0.1"

RPM_NAME = "python310-django-cacheops-7.0.1-1.1.noarch.rpm"
RPM_HASH = "2c8d1ba333b16569abea4ccd2c93acf689cb07bbea2596d13cd10c6ed230c49c99b24ed468b0a939c1dc056425ef87e00c022a0bbaabf5641c1a61b6570c4e43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-cacheops python3.10dist(django-cacheops) python310-django-cacheops python3dist(django-cacheops)"
RDEPENDS:${PN} += "python(abi) python310-django python310-funcy python310-redis"

inherit rpm
