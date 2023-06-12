SUMMARY = "Python wrapper around Lua and LuaJIT"
DESCRIPTION = "Python wrapper around Lua and LuaJIT."
LICENSE = "MIT"

PV = "1.14.1"

RPM_NAME = "python39-lupa-1.14.1-1.5.aarch64.rpm"
RPM_HASH = "f63ca1a2a4d385e1e37a9289c038085a90ae1f31980966a922b57ab82cd7920b2218642eb32ac2245a92e46e4485a9ee8837b7adc9ae555ee6044bc5cfdc1dc6"

RPROVIDES:${PN} += "python3.9dist(lupa) \
python39-lupa \
python39-lupa(aarch-64) \
python3dist(lupa)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libluajit-5.1.so.2()(64bit) \
python(abi)"

inherit rpm
