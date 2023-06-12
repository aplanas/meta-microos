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

RPM_NAME = "libphonenumber-devel-8.12.23-1.30.aarch64.rpm"
RPM_HASH = "efa4d3eebbe1d91e6d5f67d98afd190d67da4431a5b513de4610cf67c7dee2e793b706b7320fd33f8d95a1b37ff2cf452d8149bdfbd27474086d88305ed8feea"

RPROVIDES:${PN} += "libphonenumber-devel \
libphonenumber-devel(aarch-64)"
RDEPENDS:${PN} += "libphonenumber8 \
pkgconfig(protobuf)"

inherit rpm
