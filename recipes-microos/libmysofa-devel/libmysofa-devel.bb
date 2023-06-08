SUMMARY = "Development headers and libraries for libmysofa"
DESCRIPTION = "This is a C library to read AES SOFA files that contain HRTFs stored \
according to the AES69-2015 standard. \
 \
This package contains the development libraries and headers for libmysofa."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "libmysofa-devel-1.3.1-1.3.aarch64.rpm"
RPM_HASH = "d52f8caeef03e9868cfafea2a738395b8a06534b663796c3f1aa87256b55afdb4604e11ff6651583884171f6c6f6459a4af3825204402830ed21ac82529a14c3"

RPROVIDES:${PN} += "libmysofa-devel libmysofa-devel(aarch-64) pkgconfig(libmysofa)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libmysofa1"

inherit rpm
