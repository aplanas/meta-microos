SUMMARY = "Python module for extracting data from .xls Excel spreadsheet files"
DESCRIPTION = "A library for reading data and formatting information from Excel files \
in the historical .xls format."
LICENSE = "BSD-3-Clause"

PV = "2.0.1"

RPM_NAME = "python310-xlrd-2.0.1-1.9.noarch.rpm"
RPM_HASH = "a83dfc300a144a07389d98c21a6fec821dcd50b212be2d6ea2c49727ce7852d9383aabc69d2836504e17bdf7bf2d89647ed197f4494cc1403a2471ac76eae69e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xlrd python3.10dist(xlrd) python310-xlrd python3dist(xlrd)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) update-alternatives"

inherit rpm
