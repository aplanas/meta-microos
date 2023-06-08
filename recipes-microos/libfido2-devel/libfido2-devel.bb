SUMMARY = "Development files for FIDO U2F and FIDO 2.0 protocols"
DESCRIPTION = "This package contains the header file needed to develop applications that \
use FIDO U2F and FIDO 2.0 protocols."
LICENSE = "BSD-2-Clause"

PV = "1.13.0"

RPM_NAME = "libfido2-devel-1.13.0-1.2.aarch64.rpm"
RPM_HASH = "415bb85e9a71c00bd7bf3c3e363ae8bd36e6e3a9768ab36ef11aff8256ee7605f8581605692a19cb8cf5aec10c4a38ef4ac8b06600d7af0d9d06282596122624"

RPROVIDES:${PN} += "libfido2-devel libfido2-devel(aarch-64) pkgconfig(libfido2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libfido2-1 openssl-devel pkgconfig(libcrypto)"

inherit rpm
