SUMMARY = "A high-level Python Web framework"
DESCRIPTION = "Django is a high-level Python Web framework that encourages rapid development and clean, pragmatic design."
LICENSE = "BSD-3-Clause"

PV = "4.2"

RPM_NAME = "python310-Django-4.2-2.1.noarch.rpm"
RPM_HASH = "c46ac81c8f33bc49011288361c5cb0847fd4219e47df386faaf525b1468f58749fea37b8bd7c7b66ba2325cc9f4fdee69736600eb22cbbcdb36aa35321c29b8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Django python3-South python3-django python3.10dist(django) python310-Django python310-South python310-django python3dist(django)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310 python310-Pillow python310-argon2-cffi python310-asgiref python310-bcrypt python310-pytz python310-setuptools python310-sqlparse update-alternatives"

inherit rpm
