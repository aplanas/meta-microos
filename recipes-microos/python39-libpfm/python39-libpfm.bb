SUMMARY = "Python bindings for libpfm and perf_event_open system call"
DESCRIPTION = "This package provides python bindings for the libpfm4 package and the perf_event_open system call."
LICENSE = "MIT"

PV = "4.13.0"

RPM_NAME = "python39-libpfm-4.13.0-1.1.aarch64.rpm"
RPM_HASH = "0763022a6d059d89f5f917b3c97fdaa0885871345b3f75e432ea04bed167f07d868d843205a3e1ff0180727b51bb6f431374057635beb75c2440649a84209590"

RPROVIDES:${PN} += "python3.9dist(perfmon) python39-libpfm python39-libpfm(aarch-64) python3dist(perfmon)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpfm.so.4()(64bit) libpfm4 python(abi)"

inherit rpm
