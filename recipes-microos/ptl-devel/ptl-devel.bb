SUMMARY = "Headers for building with PTL"
DESCRIPTION = "Parallel Tasking Library (PTL) is a C++11 multithreading tasking \
system on top of std::thread featuring thread pools, task groups, \
and lock-free task queues. \
 \
This package provides the headers and sources for developing against PTL."
LICENSE = "MIT"

PV = "2.3.3"

RPM_NAME = "ptl-devel-2.3.3-1.8.aarch64.rpm"
RPM_HASH = "5ae32e98ac738d6e0d768f317697ab2eb00bee57677aa4d9cf6a4c5547c751f4049eb9bf4634e3a4103657ab7157b216f4e790097244ca97ff434b50078a71d6"

RPROVIDES:${PN} += "cmake(PTL) pkgconfig(ptl) ptl-devel ptl-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libptl2 pkgconfig(tbb) tbb-devel"

inherit rpm
