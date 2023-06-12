SUMMARY = "Development files for libseccomp, an enhanced Seccomp (mode 2) helper library"
DESCRIPTION = "The libseccomp library provides an interface to the Linux Kernel's \
syscall filtering mechanism, seccomp. The libseccomp API abstracts \
away the underlying BPF-based syscall filter language and presents a \
more conventional function-call based filtering interface. \
 \
This package contains the development files for libseccomp."
LICENSE = "LGPL-2.1-only"

PV = "2.5.4"

RPM_NAME = "libseccomp-devel-2.5.4-2.8.aarch64.rpm"
RPM_HASH = "c52cd52068d996215ff4a658e0816dd3eb91d45d8e960307efd4c3d4d69830d7cf669de419155c02128622d0a7c1f41dfd08e4eff4f8c0307d6018db08adb1ba"

RPROVIDES:${PN} += "libseccomp-devel \
libseccomp-devel(aarch-64) \
pkgconfig(libseccomp)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libseccomp2"

inherit rpm
