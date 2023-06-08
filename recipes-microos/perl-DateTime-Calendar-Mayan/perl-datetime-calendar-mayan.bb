SUMMARY = "The Mayan Long Count, Haab, and Tzolkin calendars"
DESCRIPTION = "An implementation of the Mayan Long Count, Haab, and Tzolkin calendars as \
defined in 'Calendrical Calculations The Millennium Edition'. Supplemented by \
'Frequently Asked Questions about Calendars'. \
 \
Author: \
------- \
    Joshua Hoblitt <jhoblitt@cpan.org>"
LICENSE = "Artistic-1.0"

PV = "0.0601"

RPM_NAME = "perl-DateTime-Calendar-Mayan-0.0601-19.28.aarch64.rpm"
RPM_HASH = "0f20d4c07b553ef8a43fe9e583dc6a98728f876e394cc6ac152f8583ee0f716a9f45eeca4f4168a91da2de2ff80fedb3ebd00af0addc20cbb3e140426bdeba28"

RPROVIDES:${PN} += "perl(DateTime::Calendar::Mayan) perl-DateTime-Calendar-Mayan perl-DateTime-Calendar-Mayan(aarch-64)"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(DateTime) perl(Params::Validate)"

inherit rpm
