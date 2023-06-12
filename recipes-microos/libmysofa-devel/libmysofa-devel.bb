SUMMARY = "Development headers and libraries for libmysofa"
DESCRIPTION = "This is a C library to read AES SOFA files that contain HRTFs stored \
according to the AES69-2015 standard. \
 \
This package contains the development libraries and headers for libmysofa."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "libmysofa-devel-1.3.1-1.4.aarch64.rpm"
RPM_HASH = "1916c71906e43f1f2bb02414819bb5a89b4969df4a50c3eb18634304e6da22ae1d85c31299397ab9df1e481423f8566a40dce521d13f3255fea4299ae5e0510c"

RPROVIDES:${PN} += "libmysofa-devel libmysofa-devel(aarch-64) pkgconfig(libmysofa)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libmysofa1"

inherit rpm
