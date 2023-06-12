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

RPM_NAME = "python311-docformatter-1.4-1.9.noarch.rpm"
RPM_HASH = "8442cd029c6842bbffb89f3f10ff978c2e40f07b4312ffa578e8aa231b7cfe8c6873164f14b0f8328020370993a13fdfa2de5f2fe8bbea435b1195035e0ef879"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(docformatter) \
python311-docformatter \
python3dist(docformatter)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-setuptools \
python311-untokenize \
update-alternatives"

inherit rpm
