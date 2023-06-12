SUMMARY = "MinGW Windows compiler (GCC) for C"
DESCRIPTION = "MinGW Windows compiler (GCC) for C"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-gcc-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "a93993037c88825dedb2abeeed7a134c7253404948e40c0472e3f4b50fc31319d2237f9370ae6d99bc222a7ef726d2c783c184ad104db788eccf27696d484d55"

RPROVIDES:${PN} += "mingw32(lib:atomic) \
mingw32(lib:caf_single) \
mingw32(lib:gcc) \
mingw32(lib:gcc_eh) \
mingw32(lib:gcc_s) \
mingw32(lib:gcov) \
mingw32(lib:gomp) \
mingw32(lib:ssp) \
mingw32(lib:ssp_nonshared) \
mingw32(liblto_plugin.dll) \
mingw32-gcc \
mingw32-gcc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
mingw32(libgmp-10.dll) \
mingw32(libmpc-3.dll) \
mingw32(libmpfr-4.dll) \
mingw32(libwinpthread-1.dll) \
mingw32(libz.dll) \
mingw32-binutils \
mingw32-cpp \
mingw32-headers \
mingw32-runtime \
mingw32-winpthreads-devel"

inherit rpm
