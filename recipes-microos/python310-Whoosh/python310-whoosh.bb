SUMMARY = "Pure-Python full text indexing, search, and spell checking library"
DESCRIPTION = "Whoosh is a pure-Python indexing and search library. It can be used \
to add search functionality to applications and websites. Every part \
of how Whoosh works can be extended or replaced to meet specific \
needs."
LICENSE = "BSD-2-Clause"

PV = "2.7.4"

RPM_NAME = "python310-Whoosh-2.7.4-8.1.noarch.rpm"
RPM_HASH = "1f25b1ed9459fdf80bda80db4cbfe68e6cb145126747ae61a6ff39b4bb724a1ad8f121af6d4052b4029a7b636ec45f68408bce1cb876ab19bbcb6376de37b542"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Whoosh \
python3.10dist(whoosh) \
python310-Whoosh \
python3dist(whoosh)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
