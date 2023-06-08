SUMMARY = "Core proxy client functionality for Python"
DESCRIPTION = "The python-socks package provides a core proxy client functionality for Python. \
Supports SOCKS4(a), SOCKS5, HTTP (tunneling) proxy and provides sync and async \
(asyncio, trio, curio) APIs. You probably don't need to use python-socks \
directly. It is used internally by aiohttp-socks and httpx-socks packages."
LICENSE = "Apache-2.0"

PV = "2.1.1"

RPM_NAME = "python310-python-socks-2.1.1-1.2.noarch.rpm"
RPM_HASH = "ad4711139decf206cbe6a4f48b5c3462fdccc46d656938ac16187fcdf3af8234e7da204f4cbd95a1f5de2e65c50b02587fd2175c1a6af3cef2e3715776f17e63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-socks python3.10dist(python-socks) python310-python-socks python3dist(python-socks)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
