SUMMARY = "Header files and libraries for libkrunfw development"
DESCRIPTION = " \
libkrunfw is a library bundling a Linux kernel in a dynamic library \
in a way that can be easily consumed by libkrun. \
By having the kernel bundled in a dynamic library, libkrun can leave to \
the linker the work of mapping the sections into the process, and then \
directly inject those mappings into the guest without any kind of additional \
work nor processing. \
 \
This package contains the libraries needed to develop programs \
that consume the guest payload integrated in libkrunfw."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.8.1"

RPM_NAME = "libkrunfw-devel-3.8.1-1.4.aarch64.rpm"
RPM_HASH = "242c53d495ebcc46fbc53d61e839ac324127cf3c3aa28e75f7b44430910ac8df433b4be3f9d7903b3a334b33786b44958dab49ad1c29750e60dc943819c2d0a3"

RPROVIDES:${PN} += "libkrunfw-devel libkrunfw-devel(aarch-64)"
RDEPENDS:${PN} += "libkrunfw3"

inherit rpm
