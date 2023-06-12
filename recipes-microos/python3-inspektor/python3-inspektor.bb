SUMMARY = "Program used to verify the code of your python project"
DESCRIPTION = "Inspektor is a program used to verify the code of a Python project. \
It checks code with the help of pylint, checks indentation with \
pycodestyle, and checks for PEP8 compliance. \
 \
Inspektor can work with Git and SVN checkouts."
LICENSE = "GPL-2.0-only"

PV = "0.5.2"

RPM_NAME = "python3-inspektor-0.5.2-2.8.noarch.rpm"
RPM_HASH = "2a97f9dddb1e0e7d7e497615c0e9a03ea2ccde17c6d4080292be050e1b73af626b03c501db736a72058273dd6574b7b1a2c1bfe2bafe49ed1fade37381790bf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-inspektor \
python3.10dist(inspektor) \
python3dist(inspektor)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
python(abi) \
python3-astroid \
python3-cliff \
python3-cmd2 \
python3-logutils \
python3-pbr \
python3-pycodestyle \
python3-pylint \
python3-stevedore \
python3-typed-ast \
update-alternatives"

inherit rpm
