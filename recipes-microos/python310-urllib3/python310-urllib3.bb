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

RPM_NAME = "python310-urllib3-1.26.15-2.1.noarch.rpm"
RPM_HASH = "f9f49ea4369df43026e3d387218c8efd60bb13efa646e096aac885e2e4b8d5b186c51036976b00a9072f728c09cf001f3c7c67257390cb7a358668435dc8ad36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-urllib3 python3.10dist(urllib3) python310-urllib3 python3dist(urllib3)"
RDEPENDS:${PN} += "ca-certificates-mozilla python(abi) python310-certifi python310-cryptography python310-idna python310-pyOpenSSL python310-six"

inherit rpm
