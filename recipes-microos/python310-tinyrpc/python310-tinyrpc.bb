SUMMARY = "A modular transport and protocol neutral RPC library"
DESCRIPTION = "There are a number of jsonrpc libraries already out there on PyPI, \
most of them handling one specific use case (e.g. JSON via WSGI, \
using Twisted, or TCP sockets). \
 \
None of the libraries, however, made it easy for the author of \
TinyRPC to reuse the jsonrpc-parsing bits and substitute a different \
transport (i.e. going from json via TCP to an implementation using \
WebSockets or ZeroMQ)."
LICENSE = "MIT"

PV = "1.1.6"

RPM_NAME = "python310-tinyrpc-1.1.6-1.1.noarch.rpm"
RPM_HASH = "9d9e375ff54a3028665a3190c0b0f199f580030e18f403168dda4569f901ebe5dce9468e69fe86c13a49368cabd4c24f746481c0db05874b75ab69a789246ca5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tinyrpc python3.10dist(tinyrpc) python310-tinyrpc python3dist(tinyrpc)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
