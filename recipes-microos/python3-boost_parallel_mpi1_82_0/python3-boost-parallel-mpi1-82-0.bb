SUMMARY = "Python 3.x bindings for Boost.Parallel.MPI library"
DESCRIPTION = "This package contains the Boost.Parallel.MPI bindings for Python 3.x"
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "python3-boost_parallel_mpi1_82_0-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "c8e1595b23c28858ba547653dee8fab37fbde705ae2788840e506851a086c2405f27d006cc8d5aef35800079b70da1df33763e051bea4cd60dee68ab56afeac2"

RPROVIDES:${PN} += "python3-boost_parallel_mpi-impl python3-boost_parallel_mpi1_82_0 python3-boost_parallel_mpi1_82_0(aarch-64)"
RDEPENDS:${PN} += "libboost_mpi.so.1.82.0()(64bit) libboost_mpi_python-py3.so.1.82.0()(64bit) libboost_python-py3.so.1.82.0()(64bit) libboost_serialization.so.1.82.0()(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libmpi.so.40()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) python(abi)"

inherit rpm
