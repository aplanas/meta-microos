SUMMARY = "Development libraries for BLACS (openmpi4)"
DESCRIPTION = "This package contains static libraries for BLACS, compiled against openmpi4."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libblacs2-openmpi4-devel-static-2.1.0-9.11.aarch64.rpm"
RPM_HASH = "da24d617f86a4f987dab80a83e3f9ec6493ec5234c462fc4c240940e8bd46f3f7fabe4d7215de084d960ac4e6d30958f49ac51774d0d8d4ce39192114e35a68d"

RPROVIDES:${PN} += "libblacs2-openmpi4-devel-static libblacs2-openmpi4-devel-static(aarch-64)"
RDEPENDS:${PN} += "libblacs2-openmpi4-devel"

inherit rpm
