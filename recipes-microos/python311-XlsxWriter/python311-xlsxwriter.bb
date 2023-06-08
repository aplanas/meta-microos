SUMMARY = "Python module for writing OOXML spreadsheet files"
DESCRIPTION = "XlsxWriter is a Python module for writing files in the Microsoft \
Office Open XML spreadsheet format. It can be used to write text, \
numbers, formulas and hyperlinks to multiple worksheets and it \
supports features such as formatting and many more."
LICENSE = "BSD-2-Clause"

PV = "3.0.3"

RPM_NAME = "python311-XlsxWriter-3.0.3-1.4.noarch.rpm"
RPM_HASH = "b245d89972526d57098227c009373ffd031bdac5d9fb10a5dc1caad72e4024b5e7f01ad21b573dc29792abcc41cbea59af4a0f53fa15412bfcadd6d814956e97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xlsxwriter python3.11dist(xlsxwriter) python311-XlsxWriter python3dist(xlsxwriter)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) update-alternatives"

inherit rpm
