SUMMARY = "Econometrics functions including MLE and GMM based techniques for Octave"
DESCRIPTION = "Econometrics functions including MLE and GMM based techniques. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.2"

RPM_NAME = "octave-forge-econometrics-1.1.2-1.15.aarch64.rpm"
RPM_HASH = "5dfcf61dda53e8490e79167f6dba62e83ffb1793be5df6f66e16139d858485a54961cb4f5221fa5da3d056cd8cf75e971a8611d22724ccc6131b826e1f696713"

RPROVIDES:${PN} += "octave-forge-econometrics \
octave-forge-econometrics(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
octave-cli \
octave-forge-optim"

inherit rpm
