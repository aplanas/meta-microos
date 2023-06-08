SUMMARY = "Linux KMS/DRM based virtual Console Emulator"
DESCRIPTION = "Kmscon is a simple terminal emulator based on linux kernel mode setting (KMS). \
It is an attempt to replace the in-kernel VT implementation with a userspace \
console."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "kmscon-9.0.0-1.3.aarch64.rpm"
RPM_HASH = "6bbbe20fa92b10a38e551731d8eb19caabc2d3a10d68733e8f926e15489fff47c85cd03c172a4bc87cee300ee317e242de4ecee68a52b72c17c499e7901d68da"

RPROVIDES:${PN} += "kmscon kmscon(aarch-64) kmscon-service"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libEGL.so.1()(64bit) libGLESv2.so.2()(64bit) libc.so.6(GLIBC_2.34)(64bit) libdrm.so.2()(64bit) libgbm.so.1()(64bit) libgobject-2.0.so.0()(64bit) libpango-1.0.so.0()(64bit) libpangoft2-1.0.so.0()(64bit) libpixman-1.so.0()(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libtsm.so.4()(64bit) libtsm.so.4(LIBTSM_1)(64bit) libtsm.so.4(LIBTSM_2)(64bit) libtsm.so.4(LIBTSM_3)(64bit) libtsm.so.4(LIBTSM_4)(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) libxkbcommon.so.0()(64bit) libxkbcommon.so.0(V_0.5.0)(64bit)"

inherit rpm
