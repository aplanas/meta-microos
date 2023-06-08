SUMMARY = "A framework for room acoustics and audio processing in Python"
DESCRIPTION = "Pyroomacoustics is a package for audio signal processing for indoor \
applications. It was developed as a prototyping platform for \
beamforming algorithms in indoor scenarios."
LICENSE = "MIT"

PV = "0.7.3"

RPM_NAME = "python310-pyroomacoustics-0.7.3-1.5.aarch64.rpm"
RPM_HASH = "070c794e94832ae57570f3bae2d8b1023c500627f7bbf85f2c72fb7afccb4120baf66200251fda855094fe6aedbc6db94241dc335031c3a5d15117d0c61eab5b"

RPROVIDES:${PN} += "libroom.cpython-310-aarch64-linux-gnu.so()(64bit) python3-pyroomacoustics python3.10dist(pyroomacoustics) python310-pyroomacoustics python310-pyroomacoustics(aarch-64) python3dist(pyroomacoustics)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) python(abi) python310-Cython python310-matplotlib python310-numpy python310-pybind11 python310-samplerate python310-scipy python310-sounddevice"

inherit rpm
