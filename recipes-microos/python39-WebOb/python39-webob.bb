SUMMARY = "WSGI request and response object"
DESCRIPTION = "WebOb provides wrappers around the WSGI request environment, and an \
object to help create WSGI responses. \
 \
The objects map much of the specified behavior of HTTP, including \
header parsing and accessors for other standard parts of the \
environment."
LICENSE = "MIT"

PV = "1.8.7"

RPM_NAME = "python39-WebOb-1.8.7-6.1.noarch.rpm"
RPM_HASH = "2769dba2ecf48ae287e7e14c9d02bb95b5b058b5004ebf47545f498aa4c85a66ae3abd292daa4e5b796104778c96b290636347e3efe63e3b927e8f6ebb2119b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(webob) \
python39-WebOb \
python3dist(webob)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
