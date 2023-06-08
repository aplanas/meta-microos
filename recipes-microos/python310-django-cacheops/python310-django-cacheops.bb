SUMMARY = "Django ORM cache with automatic granular event-driven invalidation"
DESCRIPTION = "A slick app that supports automatic or manual queryset caching and automatic \
granular event-driven invalidation. \
 \
It uses `redis <http://redis.io/>`_ as backend for ORM cache and redis or \
filesystem for simple time-invalidated one."
LICENSE = "BSD-3-Clause"

PV = "7.0"

RPM_NAME = "python310-django-cacheops-7.0-1.1.noarch.rpm"
RPM_HASH = "82bffe1a0bb289892a71dbc7d3f6aa5e8666ff01c544c07fac520f03eda430e7af6993ccabf951cc58dc92b10a53ddf54a405def387a4f38a2867b4fdf15f659"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-cacheops python3.10dist(django-cacheops) python310-django-cacheops python3dist(django-cacheops)"
RDEPENDS:${PN} += "python(abi) python310-django python310-funcy python310-redis"

inherit rpm
