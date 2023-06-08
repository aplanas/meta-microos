SUMMARY = "GNU Data Access (GDA) Library"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-report-6.0.0-6.6.aarch64.rpm"
RPM_HASH = "92562eccd0f0c0a48f8f4188490395ea93dfe6e91623b886550467f41b3d212d531abc68187f9ea0a3f78056866fb1edd4e635b8c4b6e4c93aaa3be6852f56b5"

RPROVIDES:${PN} += "libgda-report libgda-report(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 libgda-report-6_0-6_0_0"

inherit rpm
