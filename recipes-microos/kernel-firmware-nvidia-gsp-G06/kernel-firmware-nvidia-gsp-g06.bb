SUMMARY = "Kernel firmware file for open NVIDIA kernel module driver G06"
DESCRIPTION = "This package contains the versioned kernel firmware file 'gsp.bin' for \
the OpenSource NVIDIA kernel module driver G06."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "525.116.03"

RPM_NAME = "kernel-firmware-nvidia-gsp-G06-525.116.03-1.1.aarch64.rpm"
RPM_HASH = "66443741e77ce02c5a1ca171897189c4519d3cb1696b0b1cd64b854572337af51da4a92ff5a342a3cd828c9f6280d229c8700ee152abc90acb5f8e81cf27eb5d"

RPROVIDES:${PN} += "firmware(nvidia/525.116.03/gsp_ad10x.bin) firmware(nvidia/525.116.03/gsp_tu10x.bin) kernel-firmware-nvidia-gsp-G06 kernel-firmware-nvidia-gsp-G06(aarch-64) libnvidia-ml.so.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.17)(64bit) libdl.so.2()(64bit) libdl.so.2(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libpthread.so.0()(64bit) libpthread.so.0(GLIBC_2.17)(64bit) librt.so.1()(64bit)"

inherit rpm
