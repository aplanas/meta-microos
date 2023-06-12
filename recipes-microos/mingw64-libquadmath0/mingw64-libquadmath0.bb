SUMMARY = "MinGW Windows Fortran Compiler Quadmath Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the Fortran \
compiler of the GNU Compiler Collection (GCC) and quadruple precision \
floating point operations."
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-libquadmath0-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "da5412a122dfec37ae1de36eb4a314a515203ce3de18930b19b94bbbb6cec06ae7d1d607cbd031eddce1b2cc74c759b4b875fd0671b894bbc17e72d3fa81ef26"

RPROVIDES:${PN} += "mingw64(libquadmath-0.dll) \
mingw64-libquadmath0 \
mingw64-libquadmath0(aarch-64)"
RDEPENDS:${PN} += "mingw64(libgcc_s_seh-1.dll)"

inherit rpm
