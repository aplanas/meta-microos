SUMMARY = "JSON RPC 2.0 server library"
DESCRIPTION = "A Python 3.6+ server implementation of the JSON RPC 2.0 protocol. \
This library has been pulled out of the Python Language Server project."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-python-lsp-jsonrpc-1.0.0-1.8.noarch.rpm"
RPM_HASH = "de9267a7aa67832691642143be102404b4a92d636cf065f29a3345e4e0297a8a74b57a8b72def6fd0f75939c85f49a281ad7353802ff2fcedb02926659629b1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-lsp-jsonrpc python3.10dist(python-lsp-jsonrpc) python310-python-lsp-jsonrpc python3dist(python-lsp-jsonrpc)"
RDEPENDS:${PN} += "python(abi) python310-ujson"

inherit rpm
