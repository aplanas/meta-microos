SUMMARY = "Non-local goto (setjmp/longmap) implementation based on libunwind"
DESCRIPTION = "The unwind-setjmp library offers a libunwind-based implementation of \
non-local gotos. This is a drop-in replacement for the normal, \
system-provided routines of the same name. With this library, setting \
up a non-local goto via setjmp is generally faster compared to the \
system routines, at the cost of a much slower longjmp."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "libunwind-setjmp0-1.6.2-4.5.aarch64.rpm"
RPM_HASH = "669533557ea513e0ca69c85f35a5fc413ec9fd286c308e999b43d3fb41e0f0ae1627954bb9a8d810ab528cecf247f01292e3cd1dd0efe4714cc4f003e6636e5b"

RPROVIDES:${PN} += "libunwind-setjmp.so.0()(64bit) libunwind-setjmp0 libunwind-setjmp0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libunwind-aarch64.so.8()(64bit)"

inherit rpm
