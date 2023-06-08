SUMMARY = "Data files for the Thai language support library"
DESCRIPTION = "LibThai is a set of Thai language support routines to aid \
incorporation of Thai language support into applications. It includes \
important Thai-specific functions, such as word breaking, input and \
output methods, and basic character and string support. \
 \
This package contains the data files for libthai."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.29"

RPM_NAME = "libthai-data-0.1.29-1.6.aarch64.rpm"
RPM_HASH = "4f59060ec4c3f25a8be462652525d028a31f6f14ae8acc086191e7ebd8e8ffb1020c00c5bcf710f7ef0a507206e5a5c964328200d4f09130d9b88c10cea00f05"

RPROVIDES:${PN} += "libthai-data libthai-data(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
