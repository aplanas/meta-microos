SUMMARY = "XCB utility modules"
DESCRIPTION = "The XCB util modules provide a number of libraries which sit on top \
of libxcb, the core X protocol library, and some of the extension \
libraries. These experimental libraries provide convenience functions \
and interfaces which make the raw X protocol more usable. Some of the \
libraries also provide client-side code which is not strictly part of \
the X protocol but which have traditionally been provided by Xlib. \
 \
Included in this package are: \
 \
- atom: Standard core X atom constants and atom caching. \
- aux: Convenient access to connection setup and some core requests. \
- event: Callback X event handling."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "libxcb-util1-0.4.1-1.2.aarch64.rpm"
RPM_HASH = "6113ea05801628f677307693c374b05e084c1c4617bcc7a517481a2d0d77aae4f5bae6d5831b989451fc1d2e79eba0cb9f5a8665a993423474e9ac032ab13997"

RPROVIDES:${PN} += "libxcb-util.so.1()(64bit) libxcb-util1 libxcb-util1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libxcb.so.1()(64bit)"

inherit rpm
