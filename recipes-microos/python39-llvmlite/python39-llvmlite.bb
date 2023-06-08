SUMMARY = "Lightweight wrapper around basic LLVM functionality"
DESCRIPTION = "A lightweight LLVM python binding for writing JIT compilers \
 \
The old llvmpy  binding exposes a lot of LLVM APIs but the mapping of \
C++-style memory management to Python is error prone. Numba_ and many JIT \
compilers do not need a full LLVM API.  Only the IR builder, optimizer, \
and JIT compiler APIs are necessary. \
 \
llvmlite is a project originally tailored for Numba's needs, using the \
following approach: \
 \
* A small C wrapper around the parts of the LLVM C++ API we need that are \
  not already exposed by the LLVM C API. \
* A ctypes Python wrapper around the C API. \
* A pure Python implementation of the subset of the LLVM IR builder that we \
  need for Numba."
LICENSE = "BSD-2-Clause"

PV = "0.39.1"

RPM_NAME = "python39-llvmlite-0.39.1-2.4.aarch64.rpm"
RPM_HASH = "242b16fd118c310b5b9aec0c210c262f8d3047f24c1912622325ad29e51bb8863e048454dfa0745c73e569ae54b9d0f82b029964d0c5e5d8e181750cd052114a"

RPROVIDES:${PN} += "libllvmlite.so()(64bit) python3.9dist(llvmlite) python39-llvmlite python39-llvmlite(aarch-64) python3dist(llvmlite)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM.so.11()(64bit) libLLVM.so.11(LLVM_11)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) python(abi)"

inherit rpm
