SUMMARY = "Get Information on Python Packages From PyPI"
DESCRIPTION = "Get Information on Python Packages From PyPI"
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python39-pypi-search-1.2.1-1.9.noarch.rpm"
RPM_HASH = "c8d230a36bec4d6caede86a8cdee6625d937f9ebc8a67bcde9798e404a7aac6202338c46554d5d67264cb1950cc899378ae4103b523ce7559f44456192a08c99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pypi-search) \
python39-pypi-search \
python3dist(pypi-search)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-beautifulsoup4 \
python39-html2text \
python39-requests \
update-alternatives"

inherit rpm
