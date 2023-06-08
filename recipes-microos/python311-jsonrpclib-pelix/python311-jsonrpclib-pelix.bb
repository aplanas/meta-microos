SUMMARY = "JSPN-RPC over HTTP Library for Pelix Remote Services"
DESCRIPTION = "A Python (2 & 3) JSON-RPC over HTTP that mirrors xmlrpclib syntax."
LICENSE = "Apache-2.0"

PV = "0.4.3.2"

RPM_NAME = "python311-jsonrpclib-pelix-0.4.3.2-1.3.noarch.rpm"
RPM_HASH = "c00d5039091e3a54c0373433729145a3a68d544e6ca79c9ea2af4c0cdfa61cd5ab42e180a743874012e278e0c0b13f22fd10a7c8bb1bca98c8a576efe3f6feeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jsonrpclib-pelix) python311-jsonrpclib-pelix python3dist(jsonrpclib-pelix)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
