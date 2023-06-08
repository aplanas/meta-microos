SUMMARY = "Holiday calculation library"
DESCRIPTION = "This package contains a library which helps developers determining when holidays occur."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kholidays-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "6455ca20399d30856a5eb70507d45d64f7c2bc2b291eaefad5b52cf1c57257e72fce7bf3371516bbacfb635997c80c71e803abb635ac12ab6ef10159f261105d"

RPROVIDES:${PN} += "kholidays kholidays(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
