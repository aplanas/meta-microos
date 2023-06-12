SUMMARY = "Pure Python PDF toolkit"
DESCRIPTION = "PyPDF3 is a pure-python PDF library capable of splitting, merging together, \
cropping, and transforming the pages of PDF files. It can also add custom data, \
viewing options, and passwords to PDF files. It can retrieve text and metadata \
from PDFs as well as merge entire files together."
LICENSE = "BSD-3-Clause"

PV = "1.0.6"

RPM_NAME = "python310-PyPDF3-1.0.6-1.3.noarch.rpm"
RPM_HASH = "949777edb8e3892f0d3ee29c25d606b2b2d7d4588c159d0cb1e605d42f270f2c7b6ce0b4ecc5f60076239e925e21d5c54c22ba24d016eacb289040034d034756"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyPDF3 \
python3.10dist(pypdf3) \
python310-PyPDF3 \
python3dist(pypdf3)"
RDEPENDS:${PN} += "python(abi) \
python310-tqdm"

inherit rpm
