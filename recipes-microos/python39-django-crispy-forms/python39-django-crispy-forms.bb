SUMMARY = "Django DRY Forms"
DESCRIPTION = "A module to build programmatic reusable layouts out of components \
with control over the rendered HTML without writing HTML in \
templates, and without breaking the standard way of doing things in \
Django."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "python39-django-crispy-forms-1.14.0-1.3.noarch.rpm"
RPM_HASH = "55fafa5bf89433d976c205b5d3bc76201385a91f114762ca2fd02076181f74029cef38e0f1f82d28228b06faed47ffa847040083c151f3074b079cf76988f35a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-crispy-forms) python39-django-crispy-forms python3dist(django-crispy-forms)"
RDEPENDS:${PN} += "python(abi) python39-Django"

inherit rpm
