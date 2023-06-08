SUMMARY = "A perl-script to send xmpp, similar to what mail does for mail"
DESCRIPTION = "sendxmpp is a perl-script to send xmpp (jabber), similar to \
what mail(1) does for mail."
LICENSE = "GPL-2.0-only"

PV = "1.24"

RPM_NAME = "sendxmpp-1.24-3.2.noarch.rpm"
RPM_HASH = "d0b4372b16a04ded32baa8a3e5a7bbcd671204a9d00a3ac01767d6c09ffbfa84af87fa81ca70adfdd19647a3658f9ffa7d2a316b8bdf1c4e92ab39d9eb8b2aee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sendxmpp"
RDEPENDS:${PN} += "/usr/bin/perl perl(:MODULE_COMPAT_5.36.0) perl(IO::Socket::SSL) perl(Net::XMPP)"

inherit rpm
