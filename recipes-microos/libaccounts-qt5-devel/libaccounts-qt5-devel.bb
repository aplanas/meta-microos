SUMMARY = "Development files for libaccounts-qt"
DESCRIPTION = "This package contains the development files for the accounts-qt library."
LICENSE = "LGPL-2.1-only"

PV = "1.16"

RPM_NAME = "libaccounts-qt5-devel-1.16-1.18.aarch64.rpm"
RPM_HASH = "7b2a1e9785ebb87f03b0728c0ce51bf6a61f3b02a2b2fbc5f8dc0d2e4f00f6863d06945ed3081a9d4fea9bb459cca14a03a91652752083c294b9eeb6856e2494"

RPROVIDES:${PN} += "cmake(AccountsQt5) \
libaccounts-qt5-devel \
libaccounts-qt5-devel(aarch-64) \
pkgconfig(accounts-qt5)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libaccounts-qt5-1 \
pkgconfig(Qt5Core) \
pkgconfig(Qt5Xml)"

inherit rpm
