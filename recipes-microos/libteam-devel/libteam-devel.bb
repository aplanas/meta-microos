SUMMARY = "Development files for libteam"
DESCRIPTION = "A library which is the user-space counterpart for the team network \
driver, and provides an API to control them. \
 \
This package contains the development headers for the libteam and \
libteamdctl libraries."
LICENSE = "LGPL-2.1+"

PV = "1.31"

RPM_NAME = "libteam-devel-1.31-3.8.aarch64.rpm"
RPM_HASH = "4dff7ae39fb5ea2d40be7575c4ba2b84ce5e19aea7710722833c8d324468669dac9e0c9b584b343ce6d4f04f82048eb13fd9c6f686e1dcbfa4b0dc083484700a"

RPROVIDES:${PN} += "libteam-devel libteam-devel(aarch-64) pkgconfig(libteam) pkgconfig(libteamdctl)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libteam5 libteamdctl0 pkgconfig(libnl-3.0)"

inherit rpm
