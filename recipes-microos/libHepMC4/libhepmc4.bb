SUMMARY = "Shared libraries for HepMC"
DESCRIPTION = "The HepMC package is an object oriented event record written in C++ \
for High Energy Physics Monte Carlo Generators. Many extensions from \
HEPEVT, the Fortran HEP standard, are supported: the number of entries \
is unlimited, spin density matrices can be stored with each vertex, \
flow patterns (such as color) can be stored and traced, integers \
representing random number generator states can be stored, and an \
arbitrary number of event weights can be included. Particles and \
vertices are kept separate in a graph structure, physically similar to \
a physics event. The added information supports the modularisation of \
event generators. Event information is accessed by means of iterators \
supplied with the package. \
 \
This package provides the shared libraries for HepMC."
LICENSE = "GPL-2.0-only"

PV = "2.06.11"

RPM_NAME = "libHepMC4-2.06.11-2.9.aarch64.rpm"
RPM_HASH = "535a64a24e225aa8ef6ba49d5fc156182d302cb6d9b0324284adf41570849db4af2e0a7d52945f978b63ad60f9326a36f073e242a74a738922a3dfe475ea8cf4"

RPROVIDES:${PN} += "libHepMC.so.4()(64bit) \
libHepMC4 \
libHepMC4(aarch-64) \
libHepMCfio.so.4()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.5)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
