SUMMARY = "Internationalized Resource Identifiers"
DESCRIPTION = "The IRI module provides an object representation for Internationalized \
Resource Identifiers (IRIs) as defined by at \
http://www.ietf.org/rfc/rfc3987.txt and supports their parsing, \
serializing, and base resolution."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.011"

RPM_NAME = "perl-IRI-0.011-1.13.noarch.rpm"
RPM_HASH = "1698cb370280072394976c41604612f1bbf0a3fe845998f86e30685b08065b37f5a731339f10adab5843502ed0b4853be7a6acbeeb7977d8f47d3f57f687dc70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(IRI) \
perl-IRI"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Moo) \
perl(MooX::HandlesVia) \
perl(Type::Tiny)"

inherit rpm
