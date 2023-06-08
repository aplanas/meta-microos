SUMMARY = "Steel Bank Common Lisp"
DESCRIPTION = "Steel Bank Common Lisp (SBCL) is a high performance Common Lisp \
compiler. It is open source / free software, with a permissive license. \
In addition to the compiler and runtime system for ANSI Common Lisp, it \
provides an interactive environment including a debugger, a statistical \
profiler, a code coverage tool, and many other extensions."
LICENSE = "BSD-3-Clause & SUSE-Public-Domain"

PV = "2.3.4"

RPM_NAME = "sbcl-2.3.4-1.1.aarch64.rpm"
RPM_HASH = "210f769323b3e393297a95c95e6a2fe579e2c1588171b49c1b1ee80cc539baf556f79396de24abc78c82d0a1a65fd6e4ef55fdbd12d63924a17c4a42e541fc72"

RPROVIDES:${PN} += "sbcl sbcl(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libzstd.so.1()(64bit)"

inherit rpm
