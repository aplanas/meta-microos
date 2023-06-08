SUMMARY = "Common data for the 'transmission' BitTorrent client"
DESCRIPTION = "Transmission is a BitTorrent client. It has GTK+ and Qt GUI clients, \
a daemon for servers and headless use, and both can be remote \
controlled by HTTP and the terminal. It supports Local Peer \
Discovery, DHT, µTP, PEX and magnet links."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & MIT"

PV = "4.0.3"

RPM_NAME = "transmission-common-4.0.3-1.1.noarch.rpm"
RPM_HASH = "e2a3f6c6649933a2abaaa06343e70dc82394c19d4f86ae8f6605c1859346fd16d799c248f7ee97d00c8252f185feecf21ae7065e6b3c60227850acf63a55549c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "transmission-common"
RDEPENDS:${PN} += "transmission-ui"

inherit rpm
