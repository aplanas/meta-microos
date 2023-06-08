SUMMARY = "Databases for ISO standards 639 3166 3166-2 4217 15924"
DESCRIPTION = "pycountry provides the ISO databases for the standards 639 (Languages), \
3166 (Countries), 3166-2 (Subdivisions of countries), 4217 (Currencies), \
15924 (Scripts). The databases are imported from Debian's pkg-isocodes, \
packaged into pycountry and made accessible through a Python API. \
Translation files for the various strings are included as well."
LICENSE = "LGPL-2.1-only"

PV = "22.3.5"

RPM_NAME = "python39-pycountry-22.3.5-2.1.noarch.rpm"
RPM_HASH = "a334a4d23df646bbee999255dda0ceb779f3a3f3f9f38fb134cd48c50c3fb14633d8b28bdeb395f4dcce77dcd29b3023622de799ecee50813d99156b9b08c59e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pycountry) python39-pycountry python3dist(pycountry)"
RDEPENDS:${PN} += "python(abi) python39-lxml"

inherit rpm
