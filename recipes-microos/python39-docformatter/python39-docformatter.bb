SUMMARY = "Utility to re-format docstrings per PEP 257"
DESCRIPTION = "Docformatter currently automatically formats docstrings to follow a \
subset of the PEP 257 conventions. Below are the relevant items quoted \
from PEP 257. \
 \
- For consistency, always use triple double quotes around docstrings. \
- Triple quotes are used even though the string fits on one line. \
- Multi-line docstrings consist of a summary line just like a one-line \
  docstring, followed by a blank line, followed by a more elaborate \
  description. \
- The BDFL recommends inserting a blank line between the last paragraph \
  in a multi-line docstring and its closing quotes, placing the closing \
  quotes on a line by themselves. \
 \
docformatter also handles some of the PEP 8 conventions. \
 \
- Don't write string literals that rely on significant trailing \
  whitespace. Such trailing whitespace is visually indistinguishable \
  and some editors (or more recently, reindent.py) will trim them."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "python39-docformatter-1.4-1.9.noarch.rpm"
RPM_HASH = "bd7d3d95db5c72943f364c30fe25c9602b19108864b58b692b1d3fbd5083f23b26e801bd15a8e88535ff365ec577417a8c7844026c7a2351823351a3f255a6a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(docformatter) python39-docformatter python3dist(docformatter)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-setuptools python39-untokenize update-alternatives"

inherit rpm
