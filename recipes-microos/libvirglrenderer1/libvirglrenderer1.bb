SUMMARY = "Virgil3D renderer"
DESCRIPTION = "The virgil3d rendering library is a library used by \
qemu to implement 3D GPU support for the virtio GPU."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "libvirglrenderer1-0.9.1-3.7.aarch64.rpm"
RPM_HASH = "f08539ec714060d5a3e941c9ff30236a4f00104be1fd3a6fae8916cf505a36e4d67532bd975f12bd76eb3c52c3045b154ec2f4ad7c51fd674e82577330cfc305"

RPROVIDES:${PN} += "libvirglrenderer.so.1()(64bit) \
libvirglrenderer1 \
libvirglrenderer1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdrm.so.2()(64bit) \
libepoxy.so.0()(64bit) \
libgbm.so.1()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
