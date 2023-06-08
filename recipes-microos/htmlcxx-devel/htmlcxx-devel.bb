SUMMARY = "Headers and Static Library for htmlcxx"
DESCRIPTION = "The htmlcxx-devel package contains libraries and header files for \
developing applications that use htmlcxx."
LICENSE = "LGPL-2.0-only & Apache-2.0"

PV = "0.87"

RPM_NAME = "htmlcxx-devel-0.87-2.8.aarch64.rpm"
RPM_HASH = "89e7d30708f27c1885f2a23c4de50fe2a8bccf1b337334c227bb4cf15bd0d896d5b014a52f818674783c1ba4d8b0c182e98eb958bce839533d859e27cdfa1e48"

RPROVIDES:${PN} += "htmlcxx-devel htmlcxx-devel(aarch-64) pkgconfig(htmlcxx)"
RDEPENDS:${PN} += "/usr/bin/pkg-config htmlcxx"

inherit rpm
