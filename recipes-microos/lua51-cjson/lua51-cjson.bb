SUMMARY = "Lua JSON Encoding/Decoding"
DESCRIPTION = "This is the Lua extension package for JSON encoding/decoding."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "lua51-cjson-2.1.0-2.2.aarch64.rpm"
RPM_HASH = "88c16249a81286e9c35df8818d9fa59b064a16a82bf67bb2590a10a065452ef6d85f0057e137014bf71dddadc188a1778e2222af37d7327f00f5e77364a2d07d"

RPROVIDES:${PN} += "lua51-cjson lua51-cjson(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) lua51"

inherit rpm
