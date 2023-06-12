SUMMARY = "A high-level Python Web framework"
DESCRIPTION = "Django is a high-level Python Web framework that encourages rapid development and clean, pragmatic design."
LICENSE = "BSD-3-Clause"

PV = "4.2.1"

RPM_NAME = "python311-Django-4.2.1-1.1.noarch.rpm"
RPM_HASH = "8f5511e5df98c6166915f7e7f2b51fa0848cccd4f299fc3f13e3d1af4a10b9218d235d225e2ddc17c3198b877a120b5c8ac904420f32f253248a28dce8724f10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django) python311-Django python311-South python311-django python3dist(django)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311 python311-Pillow python311-argon2-cffi python311-asgiref python311-bcrypt python311-pytz python311-setuptools python311-sqlparse update-alternatives"

inherit rpm
