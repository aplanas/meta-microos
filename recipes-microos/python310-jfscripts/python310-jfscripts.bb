SUMMARY = "A collection of various tools written by Josef Friedrich"
DESCRIPTION = "A collection of various tools written by Josef Friedrich \
  * dns-ipv6-prefix.py \
  * extract-pdftext.py \
  * find-dupes-by-size.py \
  * list-files.py \
  * mac-to-eui64.py \
  * pdf-compress.py \
  * image-into-pdf.py"
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-jfscripts-1.1.0-1.4.noarch.rpm"
RPM_HASH = "230f15122986c76dd0204afa7f9bae9f30d518c0a6335fdde98a61c5d26191f298d9ff51fa708c1b036bc8347b1cfca7d422ba61822f90fd3a0e687708022499"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jfscripts python3.10dist(jfscripts) python310-jfscripts python3dist(jfscripts)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-PyPDF2 python310-sphinx-argparse python310-termcolor update-alternatives"

inherit rpm
