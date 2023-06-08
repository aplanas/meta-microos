SUMMARY = "package kernel and initrd for OBS VM builds"
DESCRIPTION = "This package is repackaging already compiled kernels to make them usable \
inside of Open Build Service (OBS) VM builds. An initrd with some basic \
kernel modules is generated as well, but further kernel modules can be \
loaded during build when installing the kernel package."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "kernel-obs-build-6.3.1-1.2.aarch64.rpm"
RPM_HASH = "6137b44dd8cedb177b252d73515c52f2410f8586e94e1aad377c229d1d5b5e647643ebeeaec77ef0f1149d7997b457fda7387649f142a7fb8c40465b5e803593"

RPROVIDES:${PN} += "kernel-obs-build kernel-obs-build(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
