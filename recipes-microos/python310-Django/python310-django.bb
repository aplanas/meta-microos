SUMMARY = "A high-level Python Web framework"
DESCRIPTION = "Django is a high-level Python Web framework that encourages rapid development and clean, pragmatic design."
LICENSE = "BSD-3-Clause"

PV = "4.2.1"

RPM_NAME = "python310-Django-4.2.1-1.1.noarch.rpm"
RPM_HASH = "af85c77e4716b7154ba1c55d1aaf138351106ef0b4899a1def9eb4d40b68da8312cf91dd34fb7de89e46a4296e6120f30fdb00f97f9680639447d89897959356"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Django \
python3-South \
python3-django \
python3.10dist(django) \
python310-Django \
python310-South \
python310-django \
python3dist(django)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310 \
python310-Pillow \
python310-argon2-cffi \
python310-asgiref \
python310-bcrypt \
python310-pytz \
python310-setuptools \
python310-sqlparse \
update-alternatives"

inherit rpm
