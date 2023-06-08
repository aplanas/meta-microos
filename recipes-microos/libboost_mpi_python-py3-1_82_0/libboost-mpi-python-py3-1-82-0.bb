SUMMARY = "Boost.MPI Python 3.x serialization library"
DESCRIPTION = "This package contains the Boost.MPI Python 3.x serialization \
inteface."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_mpi_python-py3-1_82_0-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "4da1461c6627bc7d662c395174ff015cfff53049569ebf156b4d5be1b1b204b441d9157dca9a5077487aef6059d2d3a57b255fa3b59927c4f862f69bdfd734f7"

RPROVIDES:${PN} += "libboost_mpi_python-py3-1_82_0 libboost_mpi_python-py3-1_82_0(aarch-64) libboost_mpi_python-py3.so.1.82.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig boost-license1_82_0 libboost_python-py3.so.1.82.0()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
