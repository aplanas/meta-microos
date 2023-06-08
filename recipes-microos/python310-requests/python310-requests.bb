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

RPM_NAME = "python310-requests-2.28.2-2.2.noarch.rpm"
RPM_HASH = "320e52f3de06d05a6f5dad5bd9b8be8e78caca0d31bcb964525d0e66ddebaf45c6bfe06e9aa83757af262cc72221c069ac7a8e915b9e4406442a596ee0bf21dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests python3.10dist(requests) python310-requests python3dist(requests)"
RDEPENDS:${PN} += "ca-certificates python(abi) python310 python310-certifi python310-charset-normalizer python310-idna python310-py python310-urllib3"

inherit rpm
