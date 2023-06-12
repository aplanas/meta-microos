SUMMARY = "OpenJDK 17 Runtime Environment"
DESCRIPTION = "The OpenJDK 17 runtime environment."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.7.0"

RPM_NAME = "java-17-openjdk-17.0.7.0-3.1.aarch64.rpm"
RPM_HASH = "bc87d9000f209655574cdc1db927415f42a0cbb881070d8e2abaeb56c67aef12524b7f88892bc6187df374b3250c7514db1e2d90ea7dc75f026933df6e72db12"

RPROVIDES:${PN} += "java java-17 java-17-64 java-17-openjdk java-17-openjdk(aarch-64) java-64 java-fonts java-openjdk java-openjdk-64 jre jre-17 jre-17-64 jre-17-openjdk jre-17-openjdk-64 jre-64 jre-openjdk jre-openjdk-64 jre1.10.x jre1.3.x jre1.4.x jre1.5.x jre1.6.x jre1.7.x jre1.8.x jre1.9.x libawt_xawt.so()(64bit) libjawt.so()(64bit) libsplashscreen.so()(64bit)"
RDEPENDS:${PN} += "file fontconfig java-17-openjdk-headless ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libXi.so.6()(64bit) libXrender.so.1()(64bit) libXtst.so.6()(64bit) libawt.so()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgif.so.7()(64bit) libjava.so()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit)"

inherit rpm
