SUMMARY = "Pretty-printer for tabular data in Python"
DESCRIPTION = "Pretty-printer for tabular data in Python. \
 \
The main use cases of the library are: \
 \
 * printing small tables without hassle: just one function call, \
   formatting is guided by the data itself \
 * authoring tabular data for lightweight plain-text markup: multiple \
   output formats suitable for further editing or transformation \
 * readable presentation of mixed textual and numeric data: smart \
   column alignment, configurable number formatting, alignment by a \
   decimal point"
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python39-tabulate-0.9.0-2.1.noarch.rpm"
RPM_HASH = "62c48e48f7b79ad7e8657ed6547a02922183c17d05393b87afc9f094c8ec51e39c94fee08f60e2fc881a2032251ea85f5e3b4322938d01eef6b1efdc4a4b3cd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(tabulate) python39-tabulate python3dist(tabulate)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-setuptools update-alternatives"

inherit rpm
