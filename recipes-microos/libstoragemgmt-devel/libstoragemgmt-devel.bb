SUMMARY = "Development files for libstoragemgmt"
DESCRIPTION = "The libstoragemgmt-devel package contains libraries and header files for \
developing applications that use libstoragemgmt."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.8"

RPM_NAME = "libstoragemgmt-devel-1.9.8-1.1.aarch64.rpm"
RPM_HASH = "4a4ce5e2e1929b284708bb09bfc314068961a6358be25c85e1db3c77985ffa2b11b91b056513e7a80debb0083aa0d508a6f7912a30ca3889ac3689c910b8d4bc"

RPROVIDES:${PN} += "libstoragemgmt-devel libstoragemgmt-devel(aarch-64) pkgconfig(libstoragemgmt)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libstoragemgmt1"

inherit rpm
