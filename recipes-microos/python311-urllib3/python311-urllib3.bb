SUMMARY = "HTTP library with thread-safe connection pooling, file post, and more"
DESCRIPTION = "Highlights \
 \
- Re-use the same socket connection for multiple requests \
  (HTTPConnectionPool and HTTPSConnectionPool) \
  (with optional client-side certificate verification). \
- File posting (encode_multipart_formdata). \
- Built-in redirection and retries (optional). \
- Supports gzip and deflate decoding. \
- Thread-safe and sanity-safe. \
- Works with AppEngine, gevent, and eventlib. \
- Tested on Python 2.6+ and Python 3.3+, 100% unit test coverage. \
- Small and easy to understand codebase perfect for extending and building upon. \
  For a more comprehensive solution, have a look at \
  Requests which is also powered by urllib3."
LICENSE = "MIT"

PV = "1.26.15"

RPM_NAME = "python311-urllib3-1.26.15-2.1.noarch.rpm"
RPM_HASH = "c6b666d2ba458e8634a7ffebc406ad1f372ae559c9f8365be0888289b8aefce6f69d9746f29dcd0656ab1e3eaccabdfc346bb96b9c1e9ab340956f5834dd1155"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(urllib3) python311-urllib3 python3dist(urllib3)"
RDEPENDS:${PN} += "ca-certificates-mozilla python(abi) python311-certifi python311-cryptography python311-idna python311-pyOpenSSL python311-six"

inherit rpm
