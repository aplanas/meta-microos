SUMMARY = "Core proxy client functionality for Python"
DESCRIPTION = "The python-socks package provides a core proxy client functionality for Python. \
Supports SOCKS4(a), SOCKS5, HTTP (tunneling) proxy and provides sync and async \
(asyncio, trio, curio) APIs. You probably don't need to use python-socks \
directly. It is used internally by aiohttp-socks and httpx-socks packages."
LICENSE = "Apache-2.0"

PV = "2.1.1"

RPM_NAME = "python311-python-socks-2.1.1-1.2.noarch.rpm"
RPM_HASH = "13f95476350fa2bc275e675c9332397c952d0ab9fead511139bf2a6e0b634bf241e9b4041f4112bbb10ec3313a0ce59dc236aed21740b0c09d2c3125f6c97cab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-socks) \
python311-python-socks \
python3dist(python-socks)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
