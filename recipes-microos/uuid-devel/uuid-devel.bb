SUMMARY = "Development files for OSSP uuid"
DESCRIPTION = "OSSP uuid is a ISO C99 application programming interface (API) and \
corresponding command line interface (CLI) for the generation of DCE 1.1, \
ISO/IEC 11578:1996 and RFC 4122 compliant Universally Unique Identifier (UUID). \
It supports DCE 1.1 variant UUIDs of version 1 (time and node based), version 3 \
(name based, MD5), version 4 (random number based) and version 5 (name based, \
SHA-1). Additional API bindings are provided for the languages ISO C++98, \
Perl 5 and PHP 4/5. Optional backward compatibility exists for the ISO-C \
DCE-1.1 and Perl Data::UUID APIs. \
 \
UUIDs are 128-bit numbers which are intended to have a high likelihood of \
uniqueness over space and time and are computationally difficult to guess. They \
are globally unique identifiers which can be locally generated without \
contacting a global registration authority. UUIDs are intended as unique \
identifiers for both mass tagging objects with an extremely short lifetime and \
to reliably identifying very persistent objects across a network. \
 \
 \
This package contains the development files for OSSP uuid."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "uuid-devel-1.6.2-19.45.aarch64.rpm"
RPM_HASH = "cb6d5b61da48138f46f3b742471b1974147233e99f3396f48440d59c2abd748f3198bf747ea7072ebb7b7c55110be561479485b72e4d7a6f1de2bcf23bb9dd96"

RPROVIDES:${PN} += "pkgconfig(ossp-uuid) uuid-devel uuid-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config libossp-uuid++16 libossp-uuid16 libossp-uuid_dce16"

inherit rpm
