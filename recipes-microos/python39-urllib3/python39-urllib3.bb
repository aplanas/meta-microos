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

RPM_NAME = "python39-urllib3-1.26.15-2.1.noarch.rpm"
RPM_HASH = "caecc5e943ab2630da736905d389fbe478ddde324bac3268e50e61bedcfd754efb83c1d18a174a7abba1988eca7f9dcd2a224d96bf88e01cf622e9fc236e6c18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(urllib3) python39-urllib3 python3dist(urllib3)"
RDEPENDS:${PN} += "ca-certificates-mozilla python(abi) python39-certifi python39-cryptography python39-idna python39-pyOpenSSL python39-six"

inherit rpm
