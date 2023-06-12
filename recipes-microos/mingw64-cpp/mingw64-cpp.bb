SUMMARY = "MinGW Windows C Preprocessor"
DESCRIPTION = "MinGW Windows C Preprocessor"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-cpp-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "f66bf8a7f76283a80258e597dd510311283f1b8d5aa58ce38ba10b1660326d529a2749f09c43a7f6324ca81db01d5962968dd92c2fdf3f7ad952980ecd92e2a5"

RPROVIDES:${PN} += "mingw64-cpp \
mingw64-cpp(aarch-64)"
RDEPENDS:${PN} += "mingw64(libgmp-10.dll) \
mingw64(libmpc-3.dll) \
mingw64(libmpfr-4.dll) \
mingw64(libwinpthread-1.dll) \
mingw64(libz.dll)"

inherit rpm
