SUMMARY = "A CLI tool to check XMPP SRV records"
DESCRIPTION = "A CLI tool to check XMPP SRV records."
LICENSE = "BSD-2-Clause"

PV = "0.3.6"

RPM_NAME = "xmpp-dns-0.3.6-1.1.aarch64.rpm"
RPM_HASH = "71d413a62e168539c0f6aedde55157d4ac8cad4040f42786b4baa2141a4f8e2af1ff575334dda1b50f20ec8e10fdfdb5844ee57d634521d00e0c76a942957fe0"

RPROVIDES:${PN} += "xmpp-dns xmpp-dns(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
