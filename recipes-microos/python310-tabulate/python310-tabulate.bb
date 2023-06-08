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

RPM_NAME = "python310-tabulate-0.9.0-2.1.noarch.rpm"
RPM_HASH = "ddec544d17942535a0c37008ec80dbf3818d0a76c738f744545a8e4f1353d94ccb68983004f7ce4d642541f2fb50867e167832c4755c4a75730585d63129e07a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tabulate python3.10dist(tabulate) python310-tabulate python3dist(tabulate)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-setuptools update-alternatives"

inherit rpm
