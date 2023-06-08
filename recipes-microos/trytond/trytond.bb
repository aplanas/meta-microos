SUMMARY = "An Enterprise Resource Planning (ERP) system"
DESCRIPTION = "This package contains the server of the Tryton application platform, \
the latter of which is a three-tier high-level general purpose \
application platform written in Python, using Postgresql as the \
database engine. Tryton provides modularity, scalability and \
security."
LICENSE = "GPL-3.0-or-later"

PV = "6.0.30"

RPM_NAME = "trytond-6.0.30-1.1.noarch.rpm"
RPM_HASH = "1d88bb05bcc1b2300bee8ffdd63bf233e99f7733a707d9b6d403d41ac2d2439adae85971eb5dbf09ec42322b60ba3d4697ae7716dde1f60780fe9b263a704b25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(trytond) python3.10dist(trytond) python3dist(trytond) trytond"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/python3 /usr/sbin/groupadd /usr/sbin/useradd graphviz html2text libreoffice-pyuno python(abi) python3-Genshi python3-Levenshtein python3-Pillow python3-Werkzeug python3-bcrypt python3-dateutil python3-defusedxml python3-gevent python3-lxml python3-passlib python3-polib python3-psycopg2 python3-pydot python3-python-sql python3-relatorio python3-weasyprint python3-wrapt unoconv"

inherit rpm
