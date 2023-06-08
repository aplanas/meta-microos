SUMMARY = "Lightweight in-process concurrent programming"
DESCRIPTION = "The greenlet package is a spin-off of Stackless, a version of CPython \
that supports micro-threads called 'tasklets'. Tasklets run \
pseudo-concurrently (typically in a single or a few OS-level threads) \
and are synchronized with data exchanges on 'channels'."
LICENSE = "MIT"

PV = "1.1.3"

RPM_NAME = "python310-greenlet-1.1.3-3.1.aarch64.rpm"
RPM_HASH = "0f7f98ef687793e4439e8237c353e4552b3e73598b7765a7e1880e95625875369ed623c97ef49746ba944fdecad94326cc641435a593c8bc75bf211ce485bbe0"

RPROVIDES:${PN} += "python3-greenlet python3.10dist(greenlet) python310-greenlet python310-greenlet(aarch-64) python3dist(greenlet)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) python(abi)"

inherit rpm
