SUMMARY = "A library of utilities for working with CSV"
DESCRIPTION = "CSVkit is a library of utilities for working with CSV. It is inspired \
by pdftk, gdal and the original csvcut utility by Joe Germuska and \
Aaron Bycoffe."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python310-csvkit-1.1.1-3.1.noarch.rpm"
RPM_HASH = "d4d85cd834e585138909938feb8a4462187676d0476ed943a9e56bd03649b812ebd575bf9b98b6677cd78738bb90d2a22a412487eb9f407294377c5d585853af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-csvkit python3.10dist(csvkit) python310-csvkit python3dist(csvkit)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-agate python310-agate-dbf python310-agate-excel python310-agate-sql update-alternatives"

inherit rpm
