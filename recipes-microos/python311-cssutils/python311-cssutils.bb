SUMMARY = "A CSS Cascading Style Sheets library for Python"
DESCRIPTION = "A Python package to parse and build CSS Cascading Style Sheets. DOM only, not any rendering facilities!"
LICENSE = "LGPL-3.0-or-later"

PV = "2.6.0"

RPM_NAME = "python311-cssutils-2.6.0-1.4.noarch.rpm"
RPM_HASH = "4de6d90f8dea37d364c9f849dc004193548d6fdc46da73eed83cd86671d7bf457148892f39151a36794fb14aa2fbf88fe52e89bbdf1f7b4b373ecb988207050e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cssutils) python311-cssutils python3dist(cssutils)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) update-alternatives"

inherit rpm
