SUMMARY = "Development files for the LinuxPPS API"
DESCRIPTION = "This subpackage contains a header-only C API providing a number of \
inline C functions that call out to the kernel's Pulse Per Second \
API. It is, for example, used by ntpd to interact with timing \
devices."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.0+git.20211122"

RPM_NAME = "pps-tools-devel-0.0.0+git.20211122-1.2.aarch64.rpm"
RPM_HASH = "80875cf090d3dd43c95454ebab511b06a8f668523bd60821d9708c6a0c3a2f081f14d88094a5a7690d5edc4913b1bb4a72da9df5248c5fec0c63fc9b6fd85d12"

RPROVIDES:${PN} += "pps-tools-devel pps-tools-devel(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
