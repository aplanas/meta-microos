SUMMARY = "Framework for attaching comments to Django models"
DESCRIPTION = "This framework can be used to attach comments to any model, so you can use \
it for comments on blog entries, photos, book chapters, or anything else. \
 \
This is the same framework that was removed from Django 1.6."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python310-django-contrib-comments-2.2.0-1.3.noarch.rpm"
RPM_HASH = "de4bd57b88c9482d933f6170223c9d882ccdecb6c64b6e7feb27f72937bc68d8e8393cdbeb0a1ca9166b8dc11434aed1c4150d414fa0a6b6fcb0c3054c5195ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-contrib-comments python3.10dist(django-contrib-comments) python310-django-contrib-comments python3dist(django-contrib-comments)"
RDEPENDS:${PN} += "python(abi) python310-Django"

inherit rpm
