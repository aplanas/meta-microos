SUMMARY = "Perl extension for merging IPv4 or IPv6 CIDR addresses"
DESCRIPTION = "Faster alternative to Net::CIDR when merging a large number of CIDR address \
ranges. Works for IPv4 and IPv6 addresses."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.22"

RPM_NAME = "perl-Net-CIDR-Lite-0.22-1.10.noarch.rpm"
RPM_HASH = "f8cef546c07ac1722719772f3afcd77ba26fabee879ec3aa3b0bbe027641d5104a2a82a7b21bedc68be252c895dff9f7ada38275f1e87143a6ab007b8825c97c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Net::CIDR::Lite) \
perl(Net::CIDR::Lite::Span) \
perl-Net-CIDR-Lite"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
