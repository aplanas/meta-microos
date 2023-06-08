SUMMARY = "A high-level Python Web framework"
DESCRIPTION = "Django is a high-level Python Web framework that encourages rapid development and clean, pragmatic design."
LICENSE = "BSD-3-Clause"

PV = "4.2"

RPM_NAME = "python39-Django-4.2-2.1.noarch.rpm"
RPM_HASH = "0cb0dc889d7084bcf75585af4f6aa83a67cd6ce22cf3f909296f11613c1f8c507fbdcf2169b398136bbd527923fef68566130708c0d28a54a256460101a7e605"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django) python39-Django python39-South python39-django python3dist(django)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39 python39-Pillow python39-argon2-cffi python39-asgiref python39-bcrypt python39-pytz python39-setuptools python39-sqlparse update-alternatives"

inherit rpm
