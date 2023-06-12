SUMMARY = "A sas7bdat file reader for Python"
DESCRIPTION = "This module will read sas7bdat files using pure Python (2.6+, 3+). No SAS software \
required! The module started out as a port of the R script of the same name \
found here: <https://github.com/BioStatMatt/sas7bdat> but has since been \
completely rewritten. \
 \
Also included with this library is a simple command line script, \
`sas7bdat_to_csv`, which converts sas7bdat files to csv files. It will also \
print out header information and meta data using the `--header` option and it \
will batch convert files as well. Use the `--help` option for more information."
LICENSE = "MIT"

PV = "2.2.3"

RPM_NAME = "python310-sas7bdat-2.2.3-2.13.noarch.rpm"
RPM_HASH = "4926aba5115e2306155380e5a178f67762022a2c28b232ac6d9d19d44b1dcbd738150e64af27765735e648fe3469664d4b14279a24521ad136dbb0975681fe62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sas7bdat \
python3.10dist(sas7bdat) \
python310-sas7bdat \
python3dist(sas7bdat)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-six \
update-alternatives"

inherit rpm
