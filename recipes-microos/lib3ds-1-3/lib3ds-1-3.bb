SUMMARY = "Import and Export of Autodesk 3DS Files"
DESCRIPTION = "Lib3ds is a free alternative to Autodesk's 3DS File Toolkit for \
handling 3DS files. Its main goal is to simplify the creation of 3DS \
import and export filters."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lib3ds-1-3-1.3.0-31.8.aarch64.rpm"
RPM_HASH = "a0c58ee401d8593757f91c3970c3ef0dad9164a43e1b804bf45da43dd0a9a90cac188438904c9db28776e6860240a09cc351f623c63aa6da3cdfabc84dd24b15"

RPROVIDES:${PN} += "lib3ds \
lib3ds-1-3 \
lib3ds-1-3(aarch-64) \
lib3ds-1.so.3()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
