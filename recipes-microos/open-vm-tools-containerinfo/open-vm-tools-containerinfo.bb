SUMMARY = "Container Info Plugin"
DESCRIPTION = "This package interfaces with the container runtime to retrieve a list of containers running on a Linux guest"
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "12.2.0"

RPM_NAME = "open-vm-tools-containerinfo-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "6ea2df3ec9da20af32ed44605b9585e540e6ccd3b007ce417e42e6400135b39d07ccdde1b436da6cca58922c3e8d16eb3ff21c03bfcb7f8ffc3b98085ef8ce24"

RPROVIDES:${PN} += "libcontainerInfo.so()(64bit) open-vm-tools-containerinfo open-vm-tools-containerinfo(aarch-64)"
RDEPENDS:${PN} += "/bin/sh curl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libabsl_synchronization.so.2301.0.0()(64bit) libc.so.6(GLIBC_2.32)(64bit) libcurl.so.4()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgpr.so.31()(64bit) libgrpc++.so.1.54()(64bit) libgrpc.so.31()(64bit) libprotobuf-3.21.12.so()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libvmtools.so.0()(64bit) open-vm-tools(aarch-64)"

inherit rpm
