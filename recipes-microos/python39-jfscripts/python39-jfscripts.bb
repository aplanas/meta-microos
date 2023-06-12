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

RPM_NAME = "python39-jfscripts-1.1.0-1.4.noarch.rpm"
RPM_HASH = "421cfc7f91e1f39ff22f25b70a9a41205147f0819f7d72da299036122e0e22457dea6e11fce68fe667d618b64efa3ef1a03b50fc831b023cc6f241e2ad8cbd33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jfscripts) \
python39-jfscripts \
python3dist(jfscripts)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-PyPDF2 \
python39-sphinx-argparse \
python39-termcolor \
update-alternatives"

inherit rpm
