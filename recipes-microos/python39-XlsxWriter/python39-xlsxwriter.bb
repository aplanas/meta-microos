SUMMARY = "Python module for writing OOXML spreadsheet files"
DESCRIPTION = "XlsxWriter is a Python module for writing files in the Microsoft \
Office Open XML spreadsheet format. It can be used to write text, \
numbers, formulas and hyperlinks to multiple worksheets and it \
supports features such as formatting and many more."
LICENSE = "BSD-2-Clause"

PV = "3.0.3"

RPM_NAME = "python39-XlsxWriter-3.0.3-1.4.noarch.rpm"
RPM_HASH = "858ed56db69aa495028628471044eb308dc508099d567e008448f38ccc386659ef579361a4dffcf9f90287841f1d2fb4f33b503d7709c3509aea362c71b6050a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xlsxwriter \
python3.9dist(xlsxwriter) \
python39-XlsxWriter \
python3dist(xlsxwriter)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
update-alternatives"

inherit rpm
