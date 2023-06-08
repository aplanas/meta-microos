SUMMARY = "Development Files for libalkimia"
DESCRIPTION = "The development files for libalkimia."
LICENSE = "LGPL-2.1-or-later"

PV = "8.1.1"

RPM_NAME = "libalkimia5-devel-8.1.1-1.4.aarch64.rpm"
RPM_HASH = "6385956efe54b68535701657d669c3170d4b6a82d7b2e041cca4348b2b5e605759330441ef7928d964f8f8aa2306e5998f4db153b181b40d6327ca056cf1aa8f"

RPROVIDES:${PN} += "cmake(LibAlkimia5) libalkimia5-devel libalkimia5-devel(aarch-64) pkgconfig(libalkimia5)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libalkimia5-8"

inherit rpm
