SUMMARY = "Headers and libraries for developing applications using PowerMan"
DESCRIPTION = "Header files, pkg-config file and man pages for developing applications using PowerMan."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.27"

RPM_NAME = "powerman-devel-2.3.27-1.1.aarch64.rpm"
RPM_HASH = "129d3e8154e4a888704580a2f80b0b30884bcb570a46f504eaeb66f7447201bb0d394a06e00e3fbbb4506df8434e556faa1b7e02b68f14b3675eac1f7c7fb7c2"

RPROVIDES:${PN} += "pkgconfig(libpowerman) \
powerman-devel \
powerman-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpowerman0"

inherit rpm
