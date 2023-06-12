SUMMARY = "Python 3 Developement"
LICENSE = "MIT"

PV = "20180125"

RPM_NAME = "patterns-devel-python-devel_python3-20180125-4.9.aarch64.rpm"
RPM_HASH = "58f8aaea7ccdf150a2850ad8f2ff71d0a413973352a83f6c3058e8010e7fab721204714c19b92e3558db757632af27889c2c2f01b2ffe0ea76e65a4b9ce845d4"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-devel-python-devel_python3 \
patterns-devel-python-devel_python3(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
