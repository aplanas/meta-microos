SUMMARY = "Log4j like C++ Logging Library"
DESCRIPTION = "Log4cxx is a port to C++ of the log4j logging library."
LICENSE = "Apache-2.0"

PV = "0.13.0"

RPM_NAME = "liblog4cxx-devel-0.13.0-1.3.aarch64.rpm"
RPM_HASH = "41100eec30c187ee314230cc741b3875a0bc295d4bff8061608c5bad35b931b9274a73395710d083860f7deacda56844207352d1df488d1add55f5abccd50f30"

RPROVIDES:${PN} += "cmake(log4cxx) liblog4cxx-devel liblog4cxx-devel(aarch-64) pkgconfig(liblog4cxx)"
RDEPENDS:${PN} += "/usr/bin/pkg-config liblog4cxx13 pkgconfig(apr-1) pkgconfig(apr-util-1)"

inherit rpm
