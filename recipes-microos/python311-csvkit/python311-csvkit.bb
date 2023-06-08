SUMMARY = "A library of utilities for working with CSV"
DESCRIPTION = "CSVkit is a library of utilities for working with CSV. It is inspired \
by pdftk, gdal and the original csvcut utility by Joe Germuska and \
Aaron Bycoffe."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python311-csvkit-1.1.1-3.1.noarch.rpm"
RPM_HASH = "5a235e29757cef930789f85fc59198a3f9851011b658bc61026930765af4bd0e3e24e62d15d48f6c5c6e6cb33101443465af1f3fa5eb72a850f596a3e97548c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(csvkit) python311-csvkit python3dist(csvkit)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-agate python311-agate-dbf python311-agate-excel python311-agate-sql update-alternatives"

inherit rpm
