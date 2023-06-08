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

RPM_NAME = "python311-tabulate-0.9.0-2.1.noarch.rpm"
RPM_HASH = "f8b8f4f74e9be21f70ba31f073d6257643d36d140a3cf3609a206e485380300fb8f507f0efb21d323eb199b6d13f495323b3eb3a1b2aeb4075f547aca476ae43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(tabulate) python311-tabulate python3dist(tabulate)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-setuptools update-alternatives"

inherit rpm
