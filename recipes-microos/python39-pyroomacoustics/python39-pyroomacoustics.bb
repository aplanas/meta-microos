SUMMARY = "A framework for room acoustics and audio processing in Python"
DESCRIPTION = "Pyroomacoustics is a package for audio signal processing for indoor \
applications. It was developed as a prototyping platform for \
beamforming algorithms in indoor scenarios."
LICENSE = "MIT"

PV = "0.7.3"

RPM_NAME = "python39-pyroomacoustics-0.7.3-1.5.aarch64.rpm"
RPM_HASH = "c732e344c2a8ff78ebffdd22e3592e2ae8921ba526ed1b76d4edc9a45a00da7f32c0747f3a1ceffd1ed6acc91df53b97c9b6946e807e832a351d058ef1e98f07"

RPROVIDES:${PN} += "libroom.cpython-39-aarch64-linux-gnu.so()(64bit) python3.9dist(pyroomacoustics) python39-pyroomacoustics python39-pyroomacoustics(aarch-64) python3dist(pyroomacoustics)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) python(abi) python39-Cython python39-matplotlib python39-numpy python39-pybind11 python39-samplerate python39-scipy python39-sounddevice"

inherit rpm
