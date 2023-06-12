SUMMARY = "Development files for libtexpdf"
DESCRIPTION = "A PDF library extracted from TeX's dvipdfmx. Used in software such as SILE. \
This package contains the development files for libtexpdf."
LICENSE = "GPL-2.0-or-later"

PV = "0.14.9"

RPM_NAME = "libtexpdf-devel-0.14.9-1.2.aarch64.rpm"
RPM_HASH = "3114f8b56fc6c2a60227c686148167663446acf845d584dfab957188b6703b03f962546fa4ef619cdd027d736246331f5ee2cf56198b546e3a78794579a3cb84"

RPROVIDES:${PN} += "libtexpdf-devel libtexpdf-devel(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libtexpdf0"

inherit rpm
