SUMMARY = "Core proxy client functionality for Python"
DESCRIPTION = "The python-socks package provides a core proxy client functionality for Python. \
Supports SOCKS4(a), SOCKS5, HTTP (tunneling) proxy and provides sync and async \
(asyncio, trio, curio) APIs. You probably don't need to use python-socks \
directly. It is used internally by aiohttp-socks and httpx-socks packages."
LICENSE = "Apache-2.0"

PV = "2.1.1"

RPM_NAME = "python39-python-socks-2.1.1-1.2.noarch.rpm"
RPM_HASH = "0eba2fe008179bd07f74592e76ca650102abf45c6bfae52c79b1349d1705f98dcc188f2b41546a7e26f05d38030d99df4a6c21f6b958e79673ad4cb078cfb5e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-socks) python39-python-socks python3dist(python-socks)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
