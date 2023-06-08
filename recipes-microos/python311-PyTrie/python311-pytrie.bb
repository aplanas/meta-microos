SUMMARY = "A pure Python implementation of the trie data structure"
DESCRIPTION = "pytrie is a pure Python 3 implementation of the trie data structure. \
 \
A trie is an ordered tree data structure that is used to store a mapping \
where the keys are sequences, usually strings over an alphabet. In addition to \
implementing the mapping interface, tries allow finding the items for a given \
prefix, and vice versa, finding the items whose keys are prefixes of a given key."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python311-PyTrie-0.4.0-1.11.noarch.rpm"
RPM_HASH = "6786fd7cb638429e47f9cff47606d68e398b9cc265e975f691d4fd8dae5d610d9270e8ec107661e87d950b87a1fa9abd17caaef723147b4ee485da599ae2b074"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytrie) python311-PyTrie python311-pytrie python3dist(pytrie)"
RDEPENDS:${PN} += "python(abi) python311-sortedcontainers"

inherit rpm
