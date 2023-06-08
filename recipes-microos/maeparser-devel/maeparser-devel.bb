SUMMARY = "Development files for maeparser"
DESCRIPTION = "This package contains the development files for maeparser."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "maeparser-devel-1.3.1-1.4.aarch64.rpm"
RPM_HASH = "0f4dc62c8b3879d90fd64d2d75e4a9d59ad6dabb1d5fc715cdd3b5a1c25066d993a734ecd9bf19c60ae37fed070d890444a0d18f35281094d4be974c4c8291d6"

RPROVIDES:${PN} += "maeparser-devel maeparser-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_headers-devel libmaeparser1"

inherit rpm
