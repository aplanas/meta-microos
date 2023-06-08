SUMMARY = "Asynchronous HTTP client/server framework"
DESCRIPTION = "Asynchronous HTTP client/server framework for Python. \
 \
- Supports both the client and server side of HTTP protocol. \
- Supports both client and server WebSockets out-of-the-box. \
- Web-server has middleware and pluggable routing."
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "python310-aiohttp_cors-0.7.0-5.1.noarch.rpm"
RPM_HASH = "1dd2127a086e0b066e1c33e116534b7041ead20e4e97b1bed86bfa22b127cd1823279b693d869cd4a25a4857f996ef3b5a9ddf90f5b3a762bb99fe37446fa81a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiohttp_cors python3.10dist(aiohttp-cors) python310-aiohttp_cors python3dist(aiohttp-cors)"
RDEPENDS:${PN} += "python(abi) python310 python310-async_timeout python310-chardet python310-multidict python310-yarl"

inherit rpm
