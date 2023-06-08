SUMMARY = "Utility to Create ELF Boot Images from Linux Kernel Images"
DESCRIPTION = "mkelfImage is a program that makes an ELF boot image for Linux kernel \
images. The image should work with any i386 multiboot compliant boot loader \
as well as with an ELF boot loader that passes no options. It is compliant \
with the LinuxBIOS ELF booting specification or with the Linux kexec kernel \
patch.Its key feature is, that nothing relies on BIOS calls, but they are \
made when necessary. This is useful for systems running LinuxBIOS."
LICENSE = "GPL-2.0+"

PV = "2.5"

RPM_NAME = "mkelfImage-2.5-217.21.aarch64.rpm"
RPM_HASH = "d165ebfb2ab3a163e6cdec52197b0a1b8f757a69b91a24b73978439accb0fe33f1f9bc2a00202e0194a4d5f2562daa024e53b6e42721bfba5069a38ec4b49aca"

RPROVIDES:${PN} += "mkelfImage mkelfImage(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libz.so.1()(64bit)"

inherit rpm
