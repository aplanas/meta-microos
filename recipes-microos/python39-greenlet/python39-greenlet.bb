SUMMARY = "Lightweight in-process concurrent programming"
DESCRIPTION = "The greenlet package is a spin-off of Stackless, a version of CPython \
that supports micro-threads called 'tasklets'. Tasklets run \
pseudo-concurrently (typically in a single or a few OS-level threads) \
and are synchronized with data exchanges on 'channels'."
LICENSE = "MIT"

PV = "1.1.3"

RPM_NAME = "python39-greenlet-1.1.3-3.1.aarch64.rpm"
RPM_HASH = "fa86a033dc6732aa0974d06352ab219a3dcb8074d09f942648fa484e7e64e471046e910821bcafa27140db3361894416748ad6a2cabe6bda28814eee95c17c0b"

RPROVIDES:${PN} += "python3.9dist(greenlet) python39-greenlet python39-greenlet(aarch-64) python3dist(greenlet)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) python(abi)"

inherit rpm
