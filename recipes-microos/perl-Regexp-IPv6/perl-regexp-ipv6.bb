SUMMARY = "Regular expression for IPv6 addresses"
DESCRIPTION = "This module exports the $IPv6_re regular expression that matches any valid \
IPv6 address as described in 'RFC 2373 - 2.2 Text Representation of \
Addresses' but '::'. Any string not compliant with such RFC will be \
rejected. \
 \
To match full strings use '/^$IPv6_re$/'."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.03"

RPM_NAME = "perl-Regexp-IPv6-0.03-5.26.noarch.rpm"
RPM_HASH = "8ae3081b92668a494871e418fd488ea438d2dcad6234dcfb554dcb959d83335e6aa82e476d68fb9dccb703497516a7fb2a57d9a9ccf9ccb60afd5c75f95650b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Regexp::IPv6) \
perl-Regexp-IPv6"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
