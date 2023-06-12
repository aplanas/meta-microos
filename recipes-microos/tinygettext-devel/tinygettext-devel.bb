SUMMARY = "Development files for tinygettext"
DESCRIPTION = "This package contains the development files, like headers etc, for tinygettext."
LICENSE = "Zlib"

PV = "0.1.1469459657.bf66a57"

RPM_NAME = "tinygettext-devel-0.1.1469459657.bf66a57-1.26.aarch64.rpm"
RPM_HASH = "abcde161228516b29b6b0099bed5d4d2502b5dc6e1c8f309865ed206aa64588d476a33f027db7b9dfdc0d62a4221e155f1a35b13f8189884a0d21470bc843df3"

RPROVIDES:${PN} += "pkgconfig(tinygettext) \
tinygettext-devel \
tinygettext-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtinygettext0"

inherit rpm
