SUMMARY = "IPv4 and IPv6 validation methods"
DESCRIPTION = "This module provides a number IP address validation subs that both validate \
and untaint their input. This includes both basic validation ('is_ipv4()' \
and 'is_ipv6()') and special cases like checking whether an address belongs \
to a specific network or whether an address is public or private \
(reserved)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.31"

RPM_NAME = "perl-Data-Validate-IP-0.31-1.2.noarch.rpm"
RPM_HASH = "ed63bcaa5309a5720f34bc9e92c26df5372d8a54d9a39840f89c08a09ad76fac807f4930ad2e0c0fd3bf0a4ca1b397a6618d83f3e66cc60801088dbebd25496a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Data::Validate::IP) \
perl-Data-Validate-IP"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(NetAddr::IP)"

inherit rpm
