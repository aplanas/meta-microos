SUMMARY = "BDD test engine based on Vows.js"
DESCRIPTION = "pyVows is a BDD test engine based on Vows.js <http://vowsjs.org>."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python311-pyVows-3.0.0-2.13.noarch.rpm"
RPM_HASH = "f583a1e8f2a894c02ce3e2d0b791941864d65b621474e734954493f17549ff2153ef4da2d99f26274be319a57862d7c6ff4b0cc69d597bdf2293c37acc0ef56d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyvows) \
python311-pyVows \
python3dist(pyvows)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-Unidecode \
python311-gevent \
python311-preggy \
update-alternatives"

inherit rpm
