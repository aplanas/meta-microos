SUMMARY = "A code formatter written in, and written for Python"
DESCRIPTION = "Black is a code formatter written in Python, and reformats Python 2.x \
and 3.x code. \
 \
Black reformats entire files in place. It is not configurable. It \
does not take previous formatting into account. The coding style \
enforced is a PEP-8 subset, adheres to PEP-257, and otherwise passes \
the rules of the 'pycodestyle' checker. Black skips over blocks that \
start and end with '# fmt: off' and '# fmt: on', respectively. It \
also recognizes YAPF's block comments to the same effect."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python311-blue-0.9.1-2.1.noarch.rpm"
RPM_HASH = "5b52e68ef7fabea621c4219fc5a93e956abbba218aafdadf362b49fc2a58d2ea3a264cdc6cd1bd237481180ff435873dc852562182fb31419c63cc2b2afdc239"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(blue) python311-blue python3dist(blue)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-black python311-flake8 update-alternatives"

inherit rpm
