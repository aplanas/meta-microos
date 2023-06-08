SUMMARY = "Header files and documentation for libstorage-ng"
DESCRIPTION = "This package contains header files and documentation for developing with \
libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.101"

RPM_NAME = "libstorage-ng-devel-4.5.101-1.1.aarch64.rpm"
RPM_HASH = "b809b55cfda7ce434695c3411ba0880cef95ed9ea0d691be2790ac2fbcc9d3dbba8b845a7ba0b14d8025c9135553701504af11c8225dde4225a5560bc9a09953"

RPROVIDES:${PN} += "libstorage-ng-devel libstorage-ng-devel(aarch-64)"
RDEPENDS:${PN} += "gcc-c++ libstdc++-devel libstorage-ng1 pkgconfig pkgconfig(libxml-2.0)"

inherit rpm
