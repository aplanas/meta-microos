SUMMARY = "ICC profiles for testing with xcalib"
DESCRIPTION = "The ICC profiles are special for testing xcalib."
LICENSE = "GPL-2.0-or-later"

PV = "0.10"

RPM_NAME = "xcalib-profiles-0.10-1.8.aarch64.rpm"
RPM_HASH = "5b439ddcfb9ecaff0eb3e55eefd87d41cb8ef45cc7b59be4f5ebd22939ce907adbb4635cfc16430138fb196bea463f6d6fb48c74275b0d66c18d4bee58b27c5c"

RPROVIDES:${PN} += "xcalib-profiles xcalib-profiles(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
