SUMMARY = "Remote Python Call (RPyC), a RPC library"
DESCRIPTION = "RPyC (pronounced like 'are-pie-see'), or Remote Python Call, is a \
transparent library for symmetrical remote procedure calls, \
clustering, and distributed-computing.  RPyC makes use of \
object-proxying, a technique that employs python's dynamic nature, to \
overcome the physical boundaries between processes and computers, so \
that remote objects can be manipulated as if they were local."
LICENSE = "MIT"

PV = "5.3.0"

RPM_NAME = "python311-rpyc-5.3.0-2.3.noarch.rpm"
RPM_HASH = "1f4f567fe0181159c8370593acff53ad8082746e308aef04056a6fc974c4d0c140b22697e29307dc163e8d2e4b3c2a9d40a11104fb712e73f0f66370aa394994"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(rpyc) python311-rpyc python3dist(rpyc)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 /usr/bin/python3.11 python(abi) python311-plumbum update-alternatives"

inherit rpm
