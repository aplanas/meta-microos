SUMMARY = "Python library for Apache Arrow"
DESCRIPTION = "Python library for Apache Arrow. \
 \
Apache Arrow defines a language-independent columnar \
memory format for flat and hierarchical data, organized \
for efficient analytic operations on modern hardware like \
CPUs and GPUs. The Arrow memory format also supports \
zero-copy reads for lightning-fast data access without \
serialization overhead. \
 \
Arrow's libraries implement the format and provide building \
blocks for a range of use cases, including high performance \
analytics. Many popular projects use Arrow to ship columnar \
data efficiently or as the basis for analytic engines."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "11.0.0"

RPM_NAME = "python39-pyarrow-11.0.0-1.2.aarch64.rpm"
RPM_HASH = "0539c55f25170c0ea711ac0274e9c0ace3e062c53e70a5a78e6ba12fa1b3310a41b58ddf8fb91956faa4455768779eac42f40da7a65b6a99cbeea9ea35f4c0c6"

RPROVIDES:${PN} += "lib.cpython-39-aarch64-linux-gnu.so()(64bit) libarrow_python.so()(64bit) python3.9dist(pyarrow) python39-pyarrow python39-pyarrow(aarch-64) python3dist(pyarrow)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 libarrow.so.1100()(64bit) libarrow_dataset.so.1100()(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libparquet.so.1100()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) python(abi) python39-numpy update-alternatives"

inherit rpm
