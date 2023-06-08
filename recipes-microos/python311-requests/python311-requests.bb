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

RPM_NAME = "python311-requests-2.28.2-2.2.noarch.rpm"
RPM_HASH = "a198f462341953ebfc6289d9253313e7056b339113b450b66bf3258e4aebaf3830fa93860fa126a81f0c89f6d17a9f18e23b2afa4dac40aaa186ef86ef726a39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(requests) python311-requests python3dist(requests)"
RDEPENDS:${PN} += "ca-certificates python(abi) python311 python311-certifi python311-charset-normalizer python311-idna python311-py python311-urllib3"

inherit rpm
