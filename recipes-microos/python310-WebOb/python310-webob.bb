SUMMARY = "WSGI request and response object"
DESCRIPTION = "WebOb provides wrappers around the WSGI request environment, and an \
object to help create WSGI responses. \
 \
The objects map much of the specified behavior of HTTP, including \
header parsing and accessors for other standard parts of the \
environment."
LICENSE = "MIT"

PV = "1.8.7"

RPM_NAME = "python310-WebOb-1.8.7-6.1.noarch.rpm"
RPM_HASH = "d63f091b56bd419acf7526d96655e3fa0861315b046b681c311b4cfc8ff4abe9c3ad1ca41ca8e9eb2560fae56c37393d111358f02c0ce7c4c620e27d5d59580e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-WebOb python3.10dist(webob) python310-WebOb python3dist(webob)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
