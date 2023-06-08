SUMMARY = "A skin for the Django Admin-Interface"
DESCRIPTION = "A jazzy skin for the Django Admin-Interface."
LICENSE = "BSD-2-Clause & LGPL-2.1-or-later"

PV = "3.0.6"

RPM_NAME = "python310-django-grappelli-3.0.6-1.1.noarch.rpm"
RPM_HASH = "326dc85da24d0fd2bc91e0a1903428c7277cdf6dc388a21e0fbc598d369d49f3a7e95abc82ee1f24925f0b3bd54364c55d5fb31277f1e36b9662a35d87ad68c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-grappelli python3.10dist(django-grappelli) python310-django-grappelli python3dist(django-grappelli)"
RDEPENDS:${PN} += "python(abi) python310-Django"

inherit rpm
