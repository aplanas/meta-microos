SUMMARY = "Asynchronous HTTP client/server framework"
DESCRIPTION = "Asynchronous HTTP client/server framework for Python. \
 \
- Supports both the client and server side of HTTP protocol. \
- Supports both client and server WebSockets out-of-the-box. \
- Web-server has middleware and pluggable routing."
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "python39-aiohttp_cors-0.7.0-5.1.noarch.rpm"
RPM_HASH = "195cbd1865ac9fc34c943ba4645500692192e6d9cfdc801c92e6d2ddaf0276dc5c089bcecf6f7789194cc0e08873fd4f8f5e42d4a4fe5275fb694900262d6865"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(aiohttp-cors) \
python39-aiohttp_cors \
python3dist(aiohttp-cors)"
RDEPENDS:${PN} += "python(abi) \
python39 \
python39-async_timeout \
python39-chardet \
python39-multidict \
python39-yarl"

inherit rpm
