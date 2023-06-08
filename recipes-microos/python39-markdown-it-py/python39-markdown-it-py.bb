SUMMARY = "Python port of markdown-it Markdown parsing"
DESCRIPTION = "This is a Python port of [markdown-it], and some of its associated plugins. \
 \
It follows the CommonMark spec for baseline parsing, has a configurable syntax and is pluggable."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python39-markdown-it-py-2.2.0-2.1.noarch.rpm"
RPM_HASH = "765b5bbff08b28bb96afafd8141bce67d4d37be697bdd135e03a165669cf3a5d78ea520c1675c5f6992d9372be0a735e3e203b81875467a597bf432c275ef43e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(markdown-it-py) python39-markdown-it-py python3dist(markdown-it-py)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-mdurl update-alternatives"

inherit rpm
