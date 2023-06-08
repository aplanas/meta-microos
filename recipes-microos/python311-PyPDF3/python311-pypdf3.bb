SUMMARY = "Pure Python PDF toolkit"
DESCRIPTION = "PyPDF3 is a pure-python PDF library capable of splitting, merging together, \
cropping, and transforming the pages of PDF files. It can also add custom data, \
viewing options, and passwords to PDF files. It can retrieve text and metadata \
from PDFs as well as merge entire files together."
LICENSE = "BSD-3-Clause"

PV = "1.0.6"

RPM_NAME = "python311-PyPDF3-1.0.6-1.3.noarch.rpm"
RPM_HASH = "fb7c4620ab69f0fface954eb5a4d652fe1276de5268ea40674c72564ec990fff1474b6df6ff2b6b728c9a499bdada6038e342592a827319a6d5a16d580b9e8b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pypdf3) python311-PyPDF3 python3dist(pypdf3)"
RDEPENDS:${PN} += "python(abi) python311-tqdm"

inherit rpm
