SUMMARY = "Userspace Interface for Kernel DRM Services"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems that support the ioctl \
interface, and for chipsets with DRM memory manager, support for \
tracking relocations and buffers. libdrm is a low-level library, \
typically used by graphics drivers such as the Mesa DRI and X \
drivers."
LICENSE = "MIT"

PV = "2.4.115"

RPM_NAME = "libdrm2-2.4.115-2.3.aarch64.rpm"
RPM_HASH = "c928a3ceb20afff764561e434c74599e7b1f2e62312a15f753831fe6776654fcf6277a144fa7832daace63b8bf4d7a07f69de181248897df17261707eb844439"

RPROVIDES:${PN} += "libdrm.so.2()(64bit) libdrm2 libdrm2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
