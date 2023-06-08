SUMMARY = "Header files for the Common ISDN API library"
DESCRIPTION = "This package provides files needed for development of CAPI-aware \
software."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.27"

RPM_NAME = "libcapi20-devel-3.27-2.8.aarch64.rpm"
RPM_HASH = "efdfe543fb04db8b96462ce7f81b77bd9aa89d2130f46f863c9412a601a8058fe012903f5b3fae42cde01e1171db1975d0514ee722bf7f4041aa4ef532970cdf"

RPROVIDES:${PN} += "capi4linux-devel libcapi20-devel libcapi20-devel(aarch-64) pkgconfig(capi20)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcapi20-3"

inherit rpm
