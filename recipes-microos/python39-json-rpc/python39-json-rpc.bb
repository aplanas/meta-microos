SUMMARY = "JSON-RPC transport implementation"
DESCRIPTION = "JSON-RPC 2.0 and JSON-RPC 1.0 transport specification implementation. \
 \
This implementation does not have any transport functionality \
realization, only protocol. Any client or server implementation is \
easy based on current code, but requires transport libraries, such as \
requests, gevent or zmq."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "python39-json-rpc-1.14.0-1.3.noarch.rpm"
RPM_HASH = "260294f4ea71dfe551e2fde72118152fa53c51cbdaf362ec5efb9a12d40ec05cbd5cfad808dd7ecc4e91f031d7104200a68debcede99ef33661c0d64a24b7fff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(json-rpc) python39-json-rpc python3dist(json-rpc)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
