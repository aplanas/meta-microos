SUMMARY = "Sans-io socks proxy client/server with couple io backends"
DESCRIPTION = "Sans-io (https://sans-io.readthedocs.io/) socks 4/5 client/server library/framework. \
 \
 \
* No one-shot socks servers \
* Sans-io \
* asyncio-ready twunnel3 (https://github.com/jvansteirteghem/twunnel3) is dead \
* aiosocks (https://github.com/nibrag/aiosocks) do not mimic `asyncio.open_connection` arguments (maybe dead too) \
* Fun \
 \
 \
* Only tcp connect (no bind, no udp) \
* Both client and server \
* Socks versions: 4, 4a, 5 \
* Socks5 auth: no auth, username/password \
* Couple io backends: asyncio, trio, socketserver \
* One-shot socks server (`python -m siosocks`)"
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python310-siosocks-0.3.0-1.3.noarch.rpm"
RPM_HASH = "c46a84092b658a8b822154e155c0d7591eb23fcee73d72eebf04d1f68b912ffa0142d85093af8dfe70c1b43b5b2043f53007e99cc29c895773794d2e9abba4e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-siosocks python3.10dist(siosocks) python310-siosocks python3dist(siosocks)"
RDEPENDS:${PN} += "python(abi) python310-trio"

inherit rpm
