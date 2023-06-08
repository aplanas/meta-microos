SUMMARY = "OpenJDK 17 Development Environment"
DESCRIPTION = "The OpenJDK 17 development tools. \
 \
Supported architectures are ppc64le, s390x and x86_64"
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.6.0"

RPM_NAME = "java-17-openj9-devel-17.0.6.0-2.1.aarch64.rpm"
RPM_HASH = "8becceb0e09ba46447b4a303824bedc6c032325494f40c2aa0d798c186e068e1636a4c9c00d243a242839d27592a18491c17c31bb476044fdbace72e79bdb3cb"

RPROVIDES:${PN} += "java-17-devel java-17-openj9-devel java-17-openj9-devel(aarch-64) java-devel java-devel-openj9 java-devel-openjdk java-sdk java-sdk-17 java-sdk-17-openj9 java-sdk-17-openjdk java-sdk-openj9 java-sdk-openjdk libattach.so()(64bit)"
RDEPENDS:${PN} += "/bin/sh java-17-openj9 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libjava.so()(64bit) libjli.so()(64bit) update-alternatives"

inherit rpm
