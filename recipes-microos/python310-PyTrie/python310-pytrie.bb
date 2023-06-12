SUMMARY = "A pure Python implementation of the trie data structure"
DESCRIPTION = "pytrie is a pure Python 3 implementation of the trie data structure. \
 \
A trie is an ordered tree data structure that is used to store a mapping \
where the keys are sequences, usually strings over an alphabet. In addition to \
implementing the mapping interface, tries allow finding the items for a given \
prefix, and vice versa, finding the items whose keys are prefixes of a given key."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python310-PyTrie-0.4.0-1.11.noarch.rpm"
RPM_HASH = "43aee753e77c7527ce74af45100eb71b97a78fe73898be2f925a5d7c823e43c233ade1dc33bfd688c944e07ca67a7290f6a55c04bb311d4579bd51f0f68be728"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyTrie \
python3-pytrie \
python3.10dist(pytrie) \
python310-PyTrie \
python310-pytrie \
python3dist(pytrie)"
RDEPENDS:${PN} += "python(abi) \
python310-sortedcontainers"

inherit rpm
