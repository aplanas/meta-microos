SUMMARY = "JSPN-RPC over HTTP Library for Pelix Remote Services"
DESCRIPTION = "A Python (2 & 3) JSON-RPC over HTTP that mirrors xmlrpclib syntax."
LICENSE = "Apache-2.0"

PV = "0.4.3.2"

RPM_NAME = "python39-jsonrpclib-pelix-0.4.3.2-1.3.noarch.rpm"
RPM_HASH = "136a511696b85ed2ae0aee39804778b9e2cb557d0da6d8e0755dabeb459863f3a7d1c43b0d40b2aa55357e5d02404100596ab692ef1836084c63b0a08037b460"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jsonrpclib-pelix) python39-jsonrpclib-pelix python3dist(jsonrpclib-pelix)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
