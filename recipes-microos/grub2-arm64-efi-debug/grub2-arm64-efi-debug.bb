SUMMARY = "Debug symbols for arm64-efi"
DESCRIPTION = "Debug symbols for grub2-arm64-efi \
 \
Information on how to debug grub can be found online: \
https://www.cnblogs.com/coryxie/archive/2013/03/12/2956807.html"
LICENSE = "GPL-3.0-or-later"

PV = "2.06"

RPM_NAME = "grub2-arm64-efi-debug-2.06-51.1.noarch.rpm"
RPM_HASH = "b02930df9131bcfe6889642271f6080b656e42e8a29c6f5ead7957f5d775533cb230b0aab2a1cf450f3bbafc738232931987c63cc0e96e65d49fad448660c9fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-arm64-efi-debug"
RDEPENDS:${PN} += "grub2-arm64-efi"

inherit rpm
