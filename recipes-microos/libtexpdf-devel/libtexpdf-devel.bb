SUMMARY = "Development files for libtexpdf"
DESCRIPTION = "A PDF library extracted from TeX's dvipdfmx. Used in software such as SILE. \
This package contains the development files for libtexpdf."
LICENSE = "GPL-2.0-or-later"

PV = "0.14.9"

RPM_NAME = "libtexpdf-devel-0.14.9-1.1.aarch64.rpm"
RPM_HASH = "b0b215081fd3baca4ca105b7ed4396eb3115d4e871692d01e086a59fb5bcf7a695ca14dc608ac55bdd9adcc243f121b2050b9eb1941a1e695cbce14ca28db72c"

RPROVIDES:${PN} += "libtexpdf-devel libtexpdf-devel(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libtexpdf0"

inherit rpm
