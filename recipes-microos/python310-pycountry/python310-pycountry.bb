SUMMARY = "Databases for ISO standards 639 3166 3166-2 4217 15924"
DESCRIPTION = "pycountry provides the ISO databases for the standards 639 (Languages), \
3166 (Countries), 3166-2 (Subdivisions of countries), 4217 (Currencies), \
15924 (Scripts). The databases are imported from Debian's pkg-isocodes, \
packaged into pycountry and made accessible through a Python API. \
Translation files for the various strings are included as well."
LICENSE = "LGPL-2.1-only"

PV = "22.3.5"

RPM_NAME = "python310-pycountry-22.3.5-2.1.noarch.rpm"
RPM_HASH = "3593a852a14e52c5251ba17893a421a6af7104f1acb8ee956fd19322a3da901ab8f8d2bbe794a54bd941549b64af10a3471aa9751db2c085aee17315fed6e66c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pycountry python3.10dist(pycountry) python310-pycountry python3dist(pycountry)"
RDEPENDS:${PN} += "python(abi) python310-lxml"

inherit rpm
