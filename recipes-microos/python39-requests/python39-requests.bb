SUMMARY = "Python HTTP Library"
DESCRIPTION = "Requests is an HTTP library, written in Python, as an alternative \
to Python's builtin urllib2 which requires work (even \
method overrides) to perform basic tasks. \
 \
Features of Requests: \
 - GET, HEAD, POST, PUT, DELETE Requests: \
   + HTTP Header Request Attachment. \
   + Data/Params Request Attachment. \
   + Multipart File Uploads. \
   + CookieJar Support. \
   + Redirection History. \
   + Redirection Recursion Urllib Fix. \
   + Automatic Decompression of GZipped Content. \
   + Unicode URL Support. \
 - Authentication: \
   + URL + HTTP Auth Registry."
LICENSE = "Apache-2.0"

PV = "2.28.2"

RPM_NAME = "python39-requests-2.28.2-2.2.noarch.rpm"
RPM_HASH = "0125e04e5821cc87d10f48e50aff2fae0bf835d6dbb4084cac36aa78df81c9036f5439bb9ffd17e5410cb0231746590973b9fc2389f7624130d426c783654dd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(requests) python39-requests python3dist(requests)"
RDEPENDS:${PN} += "ca-certificates python(abi) python39 python39-certifi python39-charset-normalizer python39-idna python39-py python39-urllib3"

inherit rpm
