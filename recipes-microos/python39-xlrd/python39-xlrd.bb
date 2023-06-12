SUMMARY = "Python module for extracting data from .xls Excel spreadsheet files"
DESCRIPTION = "A library for reading data and formatting information from Excel files \
in the historical .xls format."
LICENSE = "BSD-3-Clause"

PV = "2.0.1"

RPM_NAME = "python39-xlrd-2.0.1-1.9.noarch.rpm"
RPM_HASH = "ddc7d41c2a82121e1e6a60d5fd366fcbd8340df7d9b14ddf574874a3ee1a2ad50f5524d749c0922e9a2c4b1f153c76ec5ca5fa3cf20df91f526694e9a2707f4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(xlrd) \
python39-xlrd \
python3dist(xlrd)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
update-alternatives"

inherit rpm
