SUMMARY = "The Vulkan 3D graphics and compute API"
DESCRIPTION = "Vulkan is a 3D graphics and compute API providing cross-platform \
access to modern GPUs with low overhead and targeting realtime \
graphics applications such as games and interactive media."
LICENSE = "Apache-2.0"

PV = "1.3.247"

RPM_NAME = "libvulkan1-1.3.247-1.1.aarch64.rpm"
RPM_HASH = "6de8574d9f7d344af43bb3f3cbb660e2008b6d6ff95f9bddad39ef64cbbd42840c19a71fafe24622a04b281f5279695924864f986bee01aee81e68675918e1ee"

RPROVIDES:${PN} += "libvulkan.so.1()(64bit) libvulkan1 libvulkan1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
