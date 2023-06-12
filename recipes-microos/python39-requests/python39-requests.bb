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

PV = "2.30.0"

RPM_NAME = "python39-requests-2.30.0-1.1.noarch.rpm"
RPM_HASH = "054a7d8a2dbd8f992f08636685740d3a5ec973960a7757f6de21678ca02ce6166a048059168b651bc345ae5460b2d62230aeb2cb9eb245b1617a41aa7e2ea62b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(requests) python39-requests python3dist(requests)"
RDEPENDS:${PN} += "ca-certificates python(abi) python39 python39-certifi python39-charset-normalizer python39-idna python39-py python39-urllib3"

inherit rpm
