SUMMARY = "Development files for the popt library"
DESCRIPTION = "The popt-devel package includes header files and libraries necessary \
for developing programs which use the popt C library. It contains the \
API documentation of the popt library, too."
LICENSE = "MIT"

PV = "1.19"

RPM_NAME = "popt-devel-1.19-1.3.aarch64.rpm"
RPM_HASH = "5445365e7ce548c9712366b31e5ab3301f4036e589235960995d5fbc0de89529810d9f0788146143a5c8388018a66f97e08836f51c765a1127487d965b4c94e9"

RPROVIDES:${PN} += "pkgconfig(popt) popt-devel popt-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel libpopt0"

inherit rpm
