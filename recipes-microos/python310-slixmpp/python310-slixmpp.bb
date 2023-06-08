SUMMARY = "Python XMPP (Jabber) Library that Implements Everything as a Plugin"
DESCRIPTION = "Slixmpp is an XMPP library for Python. Based on SleekXMPP, it uses \
asyncio instead of threads. XEP (XMPP Extended Protocol) coverage is \
realized as plugins."
LICENSE = "MIT"

PV = "1.8.3"

RPM_NAME = "python310-slixmpp-1.8.3-1.5.aarch64.rpm"
RPM_HASH = "ca94cc295bee0cb3ef05212f13a5e86ec6dccb0ed62eec7889ed40c969c921cc07cd2a76fddb577b627520b509ed5a5c91559a8933f585a66e4a272dc4b57c89"

RPROVIDES:${PN} += "python3-slixmpp python3.10dist(slixmpp) python310-slixmpp python310-slixmpp(aarch-64) python3dist(slixmpp)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libidn.so.12()(64bit) libidn.so.12(LIBIDN_1.0)(64bit) python(abi) python310-aiohttp python310-dnspython"

inherit rpm
