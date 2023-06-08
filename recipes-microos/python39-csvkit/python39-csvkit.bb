SUMMARY = "A library of utilities for working with CSV"
DESCRIPTION = "CSVkit is a library of utilities for working with CSV. It is inspired \
by pdftk, gdal and the original csvcut utility by Joe Germuska and \
Aaron Bycoffe."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python39-csvkit-1.1.1-3.1.noarch.rpm"
RPM_HASH = "6c39211cb5b15890df732f816a96d5e3b6dec6cf79118aa8d4a87b3cc06e7fc72bf2766a6cf498094c85d83a7975c9ddf6a8ed6ee06f8cf4e6b90989c80a4c36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(csvkit) python39-csvkit python3dist(csvkit)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-agate python39-agate-dbf python39-agate-excel python39-agate-sql update-alternatives"

inherit rpm
