SUMMARY = "A high level imperative/OO programming language"
DESCRIPTION = "Squirrel is a programming language featuring higher-order functions, \
classes, inheritance, delegation, tail recursion, generators, \
cooperative threads, exception handling, reference counting, garbage \
collection on demand, and a C-like syntax."
LICENSE = "MIT"

PV = "3.2"

RPM_NAME = "squirrel-3.2-2.2.aarch64.rpm"
RPM_HASH = "33a7ad9f37573886021443acb59b9eeb7f8fc90abd86d96b5bfd476621acc13f32f58048f6a7ba6aa5e7b6c22e00d22e3ce3f1ee351e9b7c3f51c589f6c69193"

RPROVIDES:${PN} += "squirrel squirrel(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libsqstdlib3.so.1001()(64bit) libsquirrel3.so.1001()(64bit)"

inherit rpm
