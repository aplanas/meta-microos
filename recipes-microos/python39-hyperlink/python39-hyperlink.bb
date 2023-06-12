SUMMARY = "Immutable URL support for Python"
DESCRIPTION = "Hyperlink provides a pure-Python implementation of immutable URLs \
based on RFC 3986 and 3987."
LICENSE = "MIT"

PV = "21.0.0"

RPM_NAME = "python39-hyperlink-21.0.0-2.1.noarch.rpm"
RPM_HASH = "faa2beaf2fab245ef6db4f534172bc91860ce14b2a5f66a539c230189dd247383e53f8fc7cd50a8395f02b7cded81d6d4fe3e1dec4fc672fb9ff390756ca37b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(hyperlink) \
python39-hyperlink \
python3dist(hyperlink)"
RDEPENDS:${PN} += "python(abi) \
python39-idna"

inherit rpm
