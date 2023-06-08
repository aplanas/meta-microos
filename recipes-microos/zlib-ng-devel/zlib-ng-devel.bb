SUMMARY = "Development files for zlib-ng"
DESCRIPTION = "The zlib-ng-devel package contains header files for \
developing application that use zlib-ng."
LICENSE = "Zlib"

PV = "2.0.7"

RPM_NAME = "zlib-ng-devel-2.0.7-1.1.aarch64.rpm"
RPM_HASH = "bc12c2e4e5cb5d2de81427c4b7f46e694d9dd7c437783145735770432ca3b79a2cd3dbfcd39790fdb6dd74050b459c167d5c3ca4d170fd504d63375d82b86472"

RPROVIDES:${PN} += "pkgconfig(zlib-ng) zlib-ng-devel zlib-ng-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libz-ng2"

inherit rpm
