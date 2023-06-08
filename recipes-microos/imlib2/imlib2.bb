SUMMARY = "Image handling and conversion library"
DESCRIPTION = "Imlib2 is an advanced replacement library for libraries like libXpm \
that provides many more features with much greater flexibility and \
speed than standard libraries, including font rasterization, rotation, \
RGBA space rendering and blending, dynamic binary filters, scripting, \
and more."
LICENSE = "BSD-3-Clause"

PV = "1.11.0"

RPM_NAME = "imlib2-1.11.0-1.3.aarch64.rpm"
RPM_HASH = "4134e63e757b237bde5285812dc19cd289b31637e4f3aec853c718d309e0e825536c27c35095693ef0b9f4be60e09817853a2898763037c6b3efe7b53b0c1a2e"

RPROVIDES:${PN} += "imlib2 imlib2(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libImlib2.so.1()(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
