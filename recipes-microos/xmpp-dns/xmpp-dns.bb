SUMMARY = "A CLI tool to check XMPP SRV records"
DESCRIPTION = "A CLI tool to check XMPP SRV records."
LICENSE = "BSD-2-Clause"

PV = "0.3.6"

RPM_NAME = "xmpp-dns-0.3.6-1.2.aarch64.rpm"
RPM_HASH = "bafddd3cddb8ed5b814aea4faab99a78c4421df2c54008f1bebf4398df00edd18598b1b6cfbf5117786d5543cdb8a5fc31ae76cc7a0949603934e722072b21df"

RPROVIDES:${PN} += "xmpp-dns xmpp-dns(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
