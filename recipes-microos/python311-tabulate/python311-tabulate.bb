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

RPM_NAME = "python311-tabulate-0.9.0-3.1.noarch.rpm"
RPM_HASH = "417bd900633b55c49401ddfb3f28f7804df6edacbb5ad0271c373f2382a918663a2822ae1dde8a4ee33ac04df8b2c8ec0f2f69046a5817a7bb82ff6d5a846d87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(tabulate) \
python311-tabulate \
python3dist(tabulate)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-setuptools \
update-alternatives"

inherit rpm
