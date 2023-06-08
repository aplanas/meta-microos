SUMMARY = "Development Headers for Exiv2"
DESCRIPTION = "Exiv2 is a C++ library and a command line utility to access image \
metadata."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "0.27.6"

RPM_NAME = "libexiv2-devel-0.27.6-3.3.aarch64.rpm"
RPM_HASH = "e7deaf5f31c8cd26db4b85bcde3a67c0185d328c9e55ec0b88e6e2f87b043e8f31b34f52a7329f9d89d6155cf4a40a4136c8da0aaa5fd305938076dd20073cc2"

RPROVIDES:${PN} += "cmake(exiv2) libexiv2-devel libexiv2-devel(aarch-64) pkgconfig(exiv2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libexiv2-27 libexiv2-xmp-static libexpat-devel libstdc++-devel pkgconfig(zlib)"

inherit rpm
