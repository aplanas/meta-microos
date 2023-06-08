SUMMARY = "Communications server for Jabber/XMPP"
DESCRIPTION = "Prosody is a communications server for Jabber/XMPP written in Lua. \
 \
Prosody can link up with other Prosody installations and other \
XMPP-compatible services to form an open communication network, \
whilst allowing control over who they connect to, and who they share \
data with."
LICENSE = "MIT"

PV = "0.12.3"

RPM_NAME = "prosody-0.12.3-1.2.aarch64.rpm"
RPM_HASH = "5bae90cc220a8d6417e470e468e567c1ff0b24c87fc656d6610f8f55ecd941ecc0ce8c89027128df4579956922c8ef5cb4590c66c4974b4f83ba6049bda3f724"

RPROVIDES:${PN} += "config(prosody) prosody prosody(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/lua5.1 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libicui18n.so.72()(64bit) libicuuc.so.72()(64bit) lua51 lua51-BitOp lua51-luaexpat lua51-luafilesystem lua51-luasec lua51-luasocket permissions shadow systemd"

inherit rpm
