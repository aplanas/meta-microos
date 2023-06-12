SUMMARY = "A clipboard module for Python"
DESCRIPTION = "A clipboard module for Python. It only handles plain text."
LICENSE = "BSD-3-Clause"

PV = "1.8.2"

RPM_NAME = "python311-pyperclip-1.8.2-2.1.noarch.rpm"
RPM_HASH = "d4a31e6e8c2f7ac87ff913205346bb14aeb2f205143e1dba90f0e17e4d01f65c04a016ebad424502733bfd444ea70d65db87df3127b296025beda55a97fdd445"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyperclip) \
python311-pyperclip \
python3dist(pyperclip)"
RDEPENDS:${PN} += "python(abi) \
xclip \
xsel"

inherit rpm
