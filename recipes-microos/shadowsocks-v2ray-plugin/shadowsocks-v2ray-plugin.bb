SUMMARY = "SIP003 plugin for shadowsocks"
DESCRIPTION = "Yet another SIP003 plugin for shadowsocks, based on v2ray"
LICENSE = "MIT"

PV = "1.3.1+git20210506.ddd7ab4"

RPM_NAME = "shadowsocks-v2ray-plugin-1.3.1+git20210506.ddd7ab4-1.10.aarch64.rpm"
RPM_HASH = "bd790deabf186f79dddbee4383d96449a55e74235c8193c932ebdffff25846d01262c41b8e2c220a0e4851daeb0cd7e63c553075cd1e09bc514cd2913f9ca512"

RPROVIDES:${PN} += "shadowsocks-v2ray-plugin shadowsocks-v2ray-plugin(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
