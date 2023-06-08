SUMMARY = "Header files for the SPOOLES library"
DESCRIPTION = "spooles-openmpi2-devel provides the header file for the SPOOLES library."
LICENSE = "BSD-2-Clause & SUSE-Public-Domain"

PV = "2.2"

RPM_NAME = "spooles-openmpi2-devel-2.2-1.4.aarch64.rpm"
RPM_HASH = "e0da54301a24154cfb3d93446094259f761a36de9b19c29cd308c8d417140f04e316216a873faffd0fb18ca4e9855929ab8106c72755ba67647d44fb0818f2a6"

RPROVIDES:${PN} += "spooles-openmpi2-devel spooles-openmpi2-devel(aarch-64)"
RDEPENDS:${PN} += "libspooles2_2-openmpi2"

inherit rpm
