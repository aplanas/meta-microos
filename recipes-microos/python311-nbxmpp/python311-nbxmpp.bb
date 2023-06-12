SUMMARY = "XMPP library by Gajim team"
DESCRIPTION = "Python-nbxmpp is a Python library that provides a way for Python \
applications to use Jabber/XMPP networks in a non-blocking way. \
This library is initialy a fork of xmpppy one, but using \
non-blocking sockets."
LICENSE = "GPL-3.0-or-later"

PV = "4.2.2"

RPM_NAME = "python311-nbxmpp-4.2.2-1.1.noarch.rpm"
RPM_HASH = "80e604e639f6c8c16bca01489ec0d5452839f3a6e1b92b31e8a30c67719b250eb61e693d2ebac3008980d437bfcc0368ebf801dabe56017f06853adff9f39688"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(nbxmpp) \
python311-nbxmpp \
python3dist(nbxmpp)"
RDEPENDS:${PN} += "python(abi) \
python3.11dist(idna) \
python3.11dist(packaging) \
python3.11dist(precis-i18n) \
python3.11dist(pygobject)"

inherit rpm
