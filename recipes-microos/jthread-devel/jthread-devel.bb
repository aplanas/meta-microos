SUMMARY = "Development files for libjthread"
DESCRIPTION = "The JThread package provides some classes to make use of threads on \
different platforms. The classes are actually wrappers around \
existing thread implementations. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libjthread."
LICENSE = "MIT"

PV = "1.3.3"

RPM_NAME = "jthread-devel-1.3.3-1.19.aarch64.rpm"
RPM_HASH = "eeab4b6506549822a342937db632e41de0bc94031cf6ee07b3c00cd6337c72d3a0fa2768762242087bc5429480dcaf65f2260f8df5e7ea4a4b6d0aed50db2e11"

RPROVIDES:${PN} += "cmake(JThread) jthread-devel jthread-devel(aarch-64) pkgconfig(jthread)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libjthread1_3_3"

inherit rpm
