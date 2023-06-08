SUMMARY = "A binding of libevent to Lua"
DESCRIPTION = "This is a binding of libevent to Lua. It will serve as a drop-in \
replacement for copas, and eventually support more features \
(async DNS, HTTP, RPC...)."
LICENSE = "MIT"

PV = "0.4.6"

RPM_NAME = "lua53-luaevent-0.4.6-4.2.aarch64.rpm"
RPM_HASH = "92f84e9cf13fc5cb57f7bce0d0adc0adbc773a9c5c816b081425f051df7590d1653151eea53e8e5e7288f4e4646104ef7c190de0f12fde7e5ba744baedf2e792"

RPROVIDES:${PN} += "lua53-event lua53-luaevent lua53-luaevent(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libevent-2.1.so.7()(64bit) lua53 lua53-luasocket"

inherit rpm
