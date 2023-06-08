SUMMARY = "OpenJDK 11 Runtime Environment with Eclipse OpenJ9 virtual machine"
DESCRIPTION = "The OpenJDK 11 with Eclipse OpenJ9 virtual machine. Eclipse OpenJ9 \
is a Java Virtual Machine for OpenJDK that is optimized for small \
footprint, fast start-up, and high throughput. \
 \
Supported architectures are ppc64le, s390x and x86_64"
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.18.0"

RPM_NAME = "java-11-openj9-11.0.18.0-2.1.aarch64.rpm"
RPM_HASH = "51ec7787f5724d17c8bebf8d3b9f7ff26492068f9b219483b22062da1036238f87bf8fab080fcc21a2d1cffa02b1aac878684cb5862e8d4bd5be6d7e81619b6b"

RPROVIDES:${PN} += "java java-11 java-11-64 java-11-openj9 java-11-openj9(aarch-64) java-64 java-fonts java-openj9 java-openj9-64 java-openjdk java-openjdk-64 jre jre-11 jre-11-64 jre-11-openj9 jre-11-openj9-64 jre-11-openjdk jre-11-openjdk-64 jre-64 jre-openj9 jre-openj9-64 jre-openjdk jre-openjdk-64 jre1.10.x jre1.3.x jre1.4.x jre1.5.x jre1.6.x jre1.7.x jre1.8.x jre1.9.x libawt_xawt.so()(64bit) libjawt.so()(64bit) libsplashscreen.so()(64bit)"
RDEPENDS:${PN} += "file fontconfig java-11-openj9-headless ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libXi.so.6()(64bit) libXrender.so.1()(64bit) libXtst.so.6()(64bit) libawt.so()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgif.so.7()(64bit) libjava.so()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) mozilla-nss"

inherit rpm
