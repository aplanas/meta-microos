SUMMARY = "HTTP/2 support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature http2"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python39-Twisted-http2-22.10.0-6.1.noarch.rpm"
RPM_HASH = "99a73a1f7893c3c22729c8d502c3e01ab40ce1c61f3042c900b42ad67d6a5feadcb1f66b7389875ba48f1434a6654333873a166de61f8211afcce03b95876afb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-Twisted-http2"
RDEPENDS:${PN} += "python39-Twisted python39-h2 python39-priority"

inherit rpm
