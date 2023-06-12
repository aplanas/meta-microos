SUMMARY = "Ncurses SIP Messages flow viewer"
DESCRIPTION = "sngrep displays SIP Messages grouped by Call-Id into flow \
diagrams. It can be used as an offline pcap viewer or online \
capture using libpcap functions. \
 \
It supports SIP UDP and TCP transports (when each message is \
delivered in one packet)."
LICENSE = "GPL-3.0-or-later"

PV = "1.7.0"

RPM_NAME = "sngrep-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "8fdea3dc0b6169be207ba11d6700e1e5dbf989246c0be5153385b991736b39e8149175e5bddace5cb771be17df06141d95e470560304494b2a32178e22f42219"

RPROVIDES:${PN} += "config(sngrep) \
sngrep \
sngrep(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libformw.so.6()(64bit) \
libformw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libmenuw.so.6()(64bit) \
libmenuw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libncursesw.so.6()(64bit) \
libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libpanelw.so.6()(64bit) \
libpanelw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libpcap.so.1()(64bit) \
libpcre.so.1()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
