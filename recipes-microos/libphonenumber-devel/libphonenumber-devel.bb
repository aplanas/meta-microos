SUMMARY = "Library for parsing, formatting, and validating international phone numbers"
DESCRIPTION = "Google's common Java, C++ and JavaScript library for parsing, formatting, \
and validating international phone numbers. The Java version is optimized \
for running on smartphones, and is used by the Android framework since 4.0 \
(Ice Cream Sandwich). \
 \
 \
This package provides libraries and header files for developing applications \
that use libphonenumber."
LICENSE = "Apache-2.0"

PV = "8.12.23"

RPM_NAME = "libphonenumber-devel-8.12.23-1.29.aarch64.rpm"
RPM_HASH = "24dc286cd14a6e5b4e6b7f3c6555dbb47503c615481e43e99f5d2a277ed59ce351602770a1f8b51db2824fe0fe3cd8473e1b784398ad7e91a5b3c9d4e0383c85"

RPROVIDES:${PN} += "libphonenumber-devel libphonenumber-devel(aarch-64)"
RDEPENDS:${PN} += "libphonenumber8 pkgconfig(protobuf)"

inherit rpm
