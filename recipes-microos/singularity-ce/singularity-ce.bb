SUMMARY = "Application and environment virtualization"
DESCRIPTION = "SingularityCE is the Community Edition of Singularity, an open source \
container platform designed to be simple, fast, and secure."
LICENSE = "Apache-2.0 & BSD-3-Clause-LBNL"

PV = "3.10.2"

RPM_NAME = "singularity-ce-3.10.2-2.3.aarch64.rpm"
RPM_HASH = "f0e9702f3ce8d0832d23de5feb9f8496e39f2ec1cbb1d643a233cc525671d47ef7c3eaca826e1f1d0a1ac20f5bc423d99220bfc8da82e48345c7e270bbf1084c"

RPROVIDES:${PN} += "config(singularity-ce) group(singularity) singularity singularity-ce singularity-ce(aarch-64) singularity-ce-runtime"
RDEPENDS:${PN} += "/bin/sh cryptsetup ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libglib-2.0.so.0()(64bit) libseccomp.so.2()(64bit) permissions runc squashfs"

inherit rpm
