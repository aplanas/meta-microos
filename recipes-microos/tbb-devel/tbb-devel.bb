SUMMARY = "Development Files for Threading Building Blocks (TBB)"
DESCRIPTION = "Threading Building Blocks (TBB) offers a rich and complete approach to \
expressing parallelism in a C++ program. It is a library that helps you take \
advantage of multi-core processor performance without having to be a threading \
expert. Threading Building Blocks is not just a threads-replacement library. It \
represents a higher-level, task-based parallelism that abstracts platform \
details and threading mechanism for performance and scalability. \
 \
This package contains the header files needed for development with tbb."
LICENSE = "Apache-2.0"

PV = "2021.8.0"

RPM_NAME = "tbb-devel-2021.8.0-1.5.aarch64.rpm"
RPM_HASH = "bb40ae2051a5ffd63ae8c1396d00337aa8b858bf17b38eeff616833fd0fd5217e7ef6eef663b1f5f6a3e3e2b3aefd1155ff6ca43d3d85d41ed7c4f664f5b2c51"

RPROVIDES:${PN} += "cmake(TBB) \
pkgconfig(tbb) \
tbb-devel \
tbb-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
c++_compiler \
libirml1 \
libtbb12 \
libtbbbind_2_5-3 \
libtbbmalloc2"

inherit rpm
