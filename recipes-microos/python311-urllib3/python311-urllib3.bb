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

RPM_NAME = "python311-urllib3-2.0.2-1.1.noarch.rpm"
RPM_HASH = "5ab73e3b511d2f96d81a6f98907af4c8f0110c6ec75cdd6452a2bc0fd2023acf3909c385dffb4af1ec4005ab7f6352af55bba2f679d5fa2fb7e892f78bbc034c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(urllib3) python311-urllib3 python3dist(urllib3)"
RDEPENDS:${PN} += "ca-certificates-mozilla python(abi) python311-certifi python311-cryptography python311-idna python311-pyOpenSSL"

inherit rpm
