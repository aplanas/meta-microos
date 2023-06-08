SUMMARY = "Stringprep Profile for Internationalized Domain Names (RFC 3491)"
DESCRIPTION = "This module implements the _nameprep_ specification, which describes how to \
prepare internationalized domain name (IDN) labels in order to increase the \
likelihood that name input and name comparison work in ways that make sense \
for typical users throughout the world. Nameprep is a profile of the \
stringprep protocol and is used as part of a suite of on-the-wire protocols \
for internationalizing the Domain Name System (DNS)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.102"

RPM_NAME = "perl-Net-IDN-Nameprep-1.102-2.14.noarch.rpm"
RPM_HASH = "59981e135107ae27be0e28b0b115e31828028de43c1627367691470ba8746c878a31b2e687b298363ffd908113ed3f1c2d81cb7e69e0a65dc7878d66ce681d1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Net::IDN::Nameprep) perl-Net-IDN-Nameprep"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Unicode::Stringprep)"

inherit rpm
