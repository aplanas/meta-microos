SUMMARY = "A library of utilities for working with CSV"
DESCRIPTION = "CSVkit is a library of utilities for working with CSV. It is inspired \
by pdftk, gdal and the original csvcut utility by Joe Germuska and \
Aaron Bycoffe."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python311-csvkit-1.1.1-4.1.noarch.rpm"
RPM_HASH = "5b0df164b66969208fa66c9f1745d58dd77bedc1843743ce187813b8f224155707b3a0090c5b232410e23e62888073ecf41dc5ae888d5b0202ec99cb0a381843"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(csvkit) \
python311-csvkit \
python3dist(csvkit)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-agate \
python311-agate-dbf \
python311-agate-excel \
python311-agate-sql \
update-alternatives"

inherit rpm
