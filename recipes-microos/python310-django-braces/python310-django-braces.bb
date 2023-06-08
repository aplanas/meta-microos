SUMMARY = "Reusable, generic mixins for Django"
DESCRIPTION = "Reusable, generic mixins for Django."
LICENSE = "BSD-3-Clause"

PV = "1.15.0"

RPM_NAME = "python310-django-braces-1.15.0-2.5.noarch.rpm"
RPM_HASH = "162a60ffba5df2cb6c4c86306b022e28e8e8c0722b84aeb658e135aa66c2a0396e1d3b96aa7b866afda451d6e18ba00b445e8129a02a157385a91628b7b82e20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-braces python3.10dist(django-braces) python310-django-braces python3dist(django-braces)"
RDEPENDS:${PN} += "python(abi) python310-Django"

inherit rpm
