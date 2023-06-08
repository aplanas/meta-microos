SUMMARY = "A high-level Python Web framework"
DESCRIPTION = "Django is a high-level Python Web framework that encourages rapid development and clean, pragmatic design."
LICENSE = "BSD-3-Clause"

PV = "4.2"

RPM_NAME = "python311-Django-4.2-2.1.noarch.rpm"
RPM_HASH = "b0e779f7c92ab8452f71260cbe29ec29518f68e2f885e3e045f716569c7ab1018dc0e9e858972a6d462e390a50ca9e7a45318f3787bd365fba539ec8421a799c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django) python311-Django python311-South python311-django python3dist(django)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311 python311-Pillow python311-argon2-cffi python311-asgiref python311-bcrypt python311-pytz python311-setuptools python311-sqlparse update-alternatives"

inherit rpm
