SUMMARY = "Open Neural Network eXchange"
DESCRIPTION = "Open format to represent deep learning models. With ONNX, AI developers can \
more easily move models between state-of-the-art tools and choose the \
combination that is best for them. ONNX is developed and supported by a \
community of partners."
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "python39-onnx-1.12.0-2.9.aarch64.rpm"
RPM_HASH = "63bf6e30cd15d6ad167c9f6275f200e19c6449554baf8571ed958929359363b899a2c44287bf96abe57e37cdd6ca3215be070e7ebe1ea2870748b9556a0324ee"

RPROVIDES:${PN} += "python3.9dist(onnx) \
python39-onnx \
python39-onnx(aarch-64) \
python39-onnx-devel \
python3dist(onnx)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
libc.so.6(GLIBC_2.33)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libonnx \
libonnx_proto \
libonnxifi_dummy \
libprotobuf-3.21.12.so()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.2)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
python(abi) \
python39-numpy \
python39-protobuf \
python39-typing_extensions \
update-alternatives"

inherit rpm
