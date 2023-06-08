SUMMARY = "Header files for the libcap-ng library"
DESCRIPTION = "The libcap-ng-devel package contains the files needed for developing \
applications that need to use the libcap-ng library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "libcap-ng-devel-0.8.3-1.8.aarch64.rpm"
RPM_HASH = "04094e1a48ea493a611e76484c0bce88197d0a27fd030709d822aa7c31a5eff4e81f5ba4a0d74a0771cccc48db34caadefc7ce9027c9996fcdc214c12ccf6ab9"

RPROVIDES:${PN} += "libcap-ng-devel libcap-ng-devel(aarch-64) pkgconfig(libcap-ng)"
RDEPENDS:${PN} += "/usr/bin/pkg-config kernel-headers libcap-ng0 pkgconfig"

inherit rpm
