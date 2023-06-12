SUMMARY = "Natural Language Toolkit"
DESCRIPTION = "NLTK -- the Natural Language Toolkit -- is a suite of \
Python modules, data sets and tutorials supporting research and \
development in Natural Language Processing."
LICENSE = "Apache-2.0"

PV = "3.8"

RPM_NAME = "python310-nltk-3.8-2.1.noarch.rpm"
RPM_HASH = "f04934762e1ead113fcb7516d5faf7eb0027e6b6a5d9bdfbb8eebc069197f792204d1737140cc622ec0dc15d4d485d75500c294b008805924653c80097a94e30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nltk \
python3.10dist(nltk) \
python310-nltk \
python3dist(nltk)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-regex \
update-alternatives"

inherit rpm
