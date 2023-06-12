SUMMARY = "Development files for openslide"
DESCRIPTION = "This package contains libraries and header files for \
developing applications that use openslide."
LICENSE = "LGPL-2.1-only"

PV = "3.4.1"

RPM_NAME = "libopenslide-devel-3.4.1-2.25.aarch64.rpm"
RPM_HASH = "42ec9e7fa378b899d8996bb97455fc9bc1fa9a0c5abcc7e60453f141fa931c8a717e042bbf35a64bcdfc0ee658232cb9edf8dbd8264732729dfe030ebac13207"

RPROVIDES:${PN} += "libopenslide-devel \
libopenslide-devel(aarch-64) \
pkgconfig(openslide)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopenslide0"

inherit rpm
