SUMMARY = "A pure Python implementation of the trie data structure"
DESCRIPTION = "pytrie is a pure Python 3 implementation of the trie data structure. \
 \
A trie is an ordered tree data structure that is used to store a mapping \
where the keys are sequences, usually strings over an alphabet. In addition to \
implementing the mapping interface, tries allow finding the items for a given \
prefix, and vice versa, finding the items whose keys are prefixes of a given key."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python39-PyTrie-0.4.0-1.11.noarch.rpm"
RPM_HASH = "8aedef1d380884e191136ccf3facbba9e161432a5bfd0c5c082fbccdac955b7023f70c8ea607d53d7cbd94518c04d58b2b332749b9b8f4a60e3e19e66f7c5f57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytrie) python39-PyTrie python39-pytrie python3dist(pytrie)"
RDEPENDS:${PN} += "python(abi) python39-sortedcontainers"

inherit rpm
