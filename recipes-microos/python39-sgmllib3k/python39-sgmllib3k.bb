SUMMARY = "Python 3 port of sgmllib"
DESCRIPTION = "Python 3 port of Python 2's standard library `sgmllib`."
LICENSE = "BSD-3-Clause & Python-2.0"

PV = "1.0.0"

RPM_NAME = "python39-sgmllib3k-1.0.0-4.6.noarch.rpm"
RPM_HASH = "f2c1417ce651136cd9daf07a070c1befd867aca601d6537e0dbe92f85740f99d39ba9a2b23ed7406f725d0f8813555f39d21ab85e40fc519ebc17a887fe92630"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sgmllib3k) python39-sgmllib3k python3dist(sgmllib3k)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
