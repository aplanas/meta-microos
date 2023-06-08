SUMMARY = "Simple Django model translations"
DESCRIPTION = "Simple Django model translations without nasty hacks, including admin integration."
LICENSE = "Apache-2.0"

PV = "2.3"

RPM_NAME = "python311-django-parler-2.3-3.3.noarch.rpm"
RPM_HASH = "c22a8731588872cb4e617f5760caa356645d25f3476cb1e7ef477b84ca787e91180aac5ae2b2599be267645d20466d9720217adfa87cb20b860407f46b907b58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-parler) python311-django-parler python3dist(django-parler)"
RDEPENDS:${PN} += "python(abi) python311-Django"

inherit rpm
