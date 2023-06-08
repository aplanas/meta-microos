SUMMARY = "PDF parser and analyzer"
DESCRIPTION = "Pdfminer.six is a community maintained fork of the original PDFMiner. It \
is a tool for extracting information from PDF documents. It focuses on \
getting and analyzing text data. Pdfminer.six extracts the text from a \
page directly from the sourcecode of the PDF. It can also be used to get \
the exact location, font or color of the text."
LICENSE = "MIT"

PV = "20200726"

RPM_NAME = "python39-pdfminer.six-20200726-3.1.noarch.rpm"
RPM_HASH = "913f95374c69a0b496e5e706d2ac4c31e3005f72ce6d868a5eefb899d25586aa17e151b2dabb1cca69478589f1619234bfa331a70399ae1ffcb9551565d7c527"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pdfminer.six) python39-pdfminer.six python39-pdfminer3k python3dist(pdfminer.six)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-chardet python39-cryptography python39-sortedcontainers update-alternatives"

inherit rpm
