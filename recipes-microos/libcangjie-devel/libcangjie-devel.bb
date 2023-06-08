SUMMARY = "Development files for the libcangjie IME"
DESCRIPTION = "libcangjie is a C library implementing the Cangjie input method, \
which is mainly used on Traditional Chinese inputing. \
 \
This package provides development files for libcangjie."
LICENSE = "LGPL-3.0+"

PV = "1.3"

RPM_NAME = "libcangjie-devel-1.3-1.20.aarch64.rpm"
RPM_HASH = "0f842876220af2b1c03256fe4f41932dd7a07eae088d336e393f48a703257402428a442e52ad36cdaae2649052846ead2f1f2e20fa381f82ff880a847bdff3f7"

RPROVIDES:${PN} += "libcangjie-devel libcangjie-devel(aarch-64) pkgconfig(cangjie)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcangjie-tools libcangjie2 pkgconfig(sqlite3)"

inherit rpm
