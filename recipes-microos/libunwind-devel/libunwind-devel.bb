SUMMARY = "Headers for the Unwind library"
DESCRIPTION = "A set of C programming interfaces to determine the call chain within a running \
program (libunwind), of a coredump image (libunwind-coredump), or of a separate \
process (libunwind-ptrace)."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "libunwind-devel-1.6.2-4.5.aarch64.rpm"
RPM_HASH = "36616d9412cf6c64b1dd46d5ed14a6e2467b6c3a0e496b59fa55479796d73bf9554226033b756aae3a3ccc6601ad393a1295e9818a1bf2a6cc758d3629b30282"

RPROVIDES:${PN} += "libunwind-devel \
libunwind-devel(aarch-64) \
pkgconfig(libunwind) \
pkgconfig(libunwind-coredump) \
pkgconfig(libunwind-generic) \
pkgconfig(libunwind-ptrace) \
pkgconfig(libunwind-setjmp)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libunwind-coredump0 \
libunwind-ptrace0 \
libunwind-setjmp0 \
libunwind8 \
pkgconfig(libunwind) \
pkgconfig(libunwind-generic)"

inherit rpm
