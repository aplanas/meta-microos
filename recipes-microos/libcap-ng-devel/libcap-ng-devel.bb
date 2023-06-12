SUMMARY = "Header files for the libcap-ng library"
DESCRIPTION = "The libcap-ng-devel package contains the files needed for developing \
applications that need to use the libcap-ng library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "libcap-ng-devel-0.8.3-2.1.aarch64.rpm"
RPM_HASH = "f53812144ae35c25a6a7905c1811868d6ac6c0a8f2c0a4ca4d4cad3539a5c3272d5e92950d2fada131e6e5c3bfb11d4de6faca24ef1d423191e8ce1bed1827f6"

RPROVIDES:${PN} += "libcap-ng-devel libcap-ng-devel(aarch-64) pkgconfig(libcap-ng)"
RDEPENDS:${PN} += "/usr/bin/pkg-config kernel-headers libcap-ng0 pkgconfig"

inherit rpm
