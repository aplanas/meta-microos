SUMMARY = "Lightweight in-process concurrent programming"
DESCRIPTION = "The greenlet package is a spin-off of Stackless, a version of CPython \
that supports micro-threads called 'tasklets'. Tasklets run \
pseudo-concurrently (typically in a single or a few OS-level threads) \
and are synchronized with data exchanges on 'channels'."
LICENSE = "MIT"

PV = "1.1.3"

RPM_NAME = "python311-greenlet-1.1.3-3.1.aarch64.rpm"
RPM_HASH = "f5933157955d8b96d04ded59647c0d6e9fa23fc27b3e19e8ea4b6a69045c8b35bc1d1ce2af1aa3d158419476492ec256baea79984e852f565eff1089304256c5"

RPROVIDES:${PN} += "python3.11dist(greenlet) python311-greenlet python311-greenlet(aarch-64) python3dist(greenlet)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) python(abi)"

inherit rpm
