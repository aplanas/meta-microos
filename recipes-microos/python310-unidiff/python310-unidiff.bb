SUMMARY = "Unified diff parsing/metadata extraction library"
DESCRIPTION = "Python library to parse and interact with unified diff data."
LICENSE = "MIT"

PV = "0.7.4"

RPM_NAME = "python310-unidiff-0.7.4-1.5.noarch.rpm"
RPM_HASH = "526d5b8390d888e5ebda3b44b30ca27c7448140c9587b6f3725f35fff5b3f415bcaa4df5567d86c7329351b161698e4e7e2a0330e840f58716d192ea013663bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-unidiff python3.10dist(unidiff) python310-unidiff python3dist(unidiff)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) update-alternatives"

inherit rpm
