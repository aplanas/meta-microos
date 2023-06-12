SUMMARY = "A library of utilities for working with CSV"
DESCRIPTION = "CSVkit is a library of utilities for working with CSV. It is inspired \
by pdftk, gdal and the original csvcut utility by Joe Germuska and \
Aaron Bycoffe."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python310-csvkit-1.1.1-4.1.noarch.rpm"
RPM_HASH = "1ec1423f518b4c4b8c0ff5545cd831eafddb1aa581e4d8c152ea0b6e8117f6c62d252df41bd8e1df4d331464e48aea0accd45c038f93d2a6823ea65e3b618cfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-csvkit python3.10dist(csvkit) python310-csvkit python3dist(csvkit)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-agate python310-agate-dbf python310-agate-excel python310-agate-sql update-alternatives"

inherit rpm
