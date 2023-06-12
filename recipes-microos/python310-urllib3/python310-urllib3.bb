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

PV = "2.0.2"

RPM_NAME = "python310-urllib3-2.0.2-1.1.noarch.rpm"
RPM_HASH = "dd0eaed58c5f6b80cb62af126cf5f9773a542f4e03538e14d0f0cb58f92474405fb27f96b04446f4d4b89db1ecf35e7a6274439b17597a8633d521a65ef6f42d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-urllib3 \
python3.10dist(urllib3) \
python310-urllib3 \
python3dist(urllib3)"
RDEPENDS:${PN} += "ca-certificates-mozilla \
python(abi) \
python310-certifi \
python310-cryptography \
python310-idna \
python310-pyOpenSSL"

inherit rpm
