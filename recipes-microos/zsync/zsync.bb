SUMMARY = "Client-side Implementation of the Rsync Algorithm over HTTP"
DESCRIPTION = "zsync is a implementation of rsync over HTTP. It allows updating of files from \
a remote Web server without requiring a full download or a special remote \
server application. It uses a metafile, which is created on the server, \
to determine which parts of a file the user already has; it then downloads \
the remaining parts via HTTP. No special server or Web server module is \
needed. It also works with gzip files, and content on the server can be \
compressed to further reduce download times."
LICENSE = "Artistic-2.0"

PV = "0.6.2"

RPM_NAME = "zsync-0.6.2-25.14.aarch64.rpm"
RPM_HASH = "ab011a034fe72938e1659118f913706372bf173009ca5b6a5e66d39fbad4b00641551afdfdb525b5d99690bfaf9aa16ebd9295dbd845b6f58660071802a7b0c2"

RPROVIDES:${PN} += "zsync zsync(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
