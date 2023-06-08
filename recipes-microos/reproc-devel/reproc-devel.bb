SUMMARY = "Development files for reproc"
DESCRIPTION = "reproc (Redirected Process) is a cross-platform C/C++ library that simplifies starting, stopping and communicating with external programs. The main use case is executing command line applications directly from C or C++ code and retrieving their output. \
 \
This package holds the development files for reproc."
LICENSE = "MIT"

PV = "14.2.4"

RPM_NAME = "reproc-devel-14.2.4-2.1.aarch64.rpm"
RPM_HASH = "0b429560571865c071c414edf277a1003b00cd092d15206d30f593cdc1caddbf5001fdec222bbbb8977cba5933348e4b6b8c25ff6d8c57e594e804de281476c7"

RPROVIDES:${PN} += "cmake(reproc) cmake(reproc++) pkgconfig(reproc) pkgconfig(reproc++) reproc-devel reproc-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libreproc++14 libreproc14"

inherit rpm
