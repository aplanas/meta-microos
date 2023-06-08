SUMMARY = "Unicode Font Viewer"
DESCRIPTION = "Ucm is a small xfs-like widget specifically designed for Unicode fonts. \
 As opposed to xfs, ucm allows you to select an arbitrary character \
which can then be pasted into another application or identify an \
arbitrary character by pasting it into ucm."
LICENSE = "BSD-3-Clause & MIT"

PV = "0.3"

RPM_NAME = "ucm-0.3-542.19.aarch64.rpm"
RPM_HASH = "b58d8a86816557786d00dc986ca5ec095fcb0e55b1957f959852d2bdb0f21789e5d92632daa83c311a4bdf54cbb63be852573da9f9f8890cb17806314d457e58"

RPROVIDES:${PN} += "ucm ucm(aarch-64)"
RDEPENDS:${PN} += "gnu-unifont libX11.so.6()(64bit) libXaw.so.7()(64bit) libXmu.so.6()(64bit) libXt.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
