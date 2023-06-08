SUMMARY = "Remote Python Call (RPyC), a RPC library"
DESCRIPTION = "RPyC (pronounced like 'are-pie-see'), or Remote Python Call, is a \
transparent library for symmetrical remote procedure calls, \
clustering, and distributed-computing.  RPyC makes use of \
object-proxying, a technique that employs python's dynamic nature, to \
overcome the physical boundaries between processes and computers, so \
that remote objects can be manipulated as if they were local."
LICENSE = "MIT"

PV = "5.3.0"

RPM_NAME = "python310-rpyc-5.3.0-2.3.noarch.rpm"
RPM_HASH = "59ceb0cc472b55995269fae6270149956a7c2e421763ac6e8aa343aa2a851965ac8a8cb2603e05141e626cb69cad182a3ae739d8f54cde25b8961ee0fc2b4884"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rpyc python3.10dist(rpyc) python310-rpyc python3dist(rpyc)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-plumbum update-alternatives"

inherit rpm
