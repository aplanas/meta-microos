SUMMARY = "NVIDIA open kernel module driver for GeForce RTX 2000 series and newer"
DESCRIPTION = "This package provides the open-source NVIDIA kernel module driver \
for GeForce RTX 2000 series and newer GPUs."
LICENSE = "GPL-2.0-only & MIT"

PV = "525.116.03_k6.3.1_1"

RPM_NAME = "nvidia-open-driver-G06-signed-kmp-default-525.116.03_k6.3.1_1-1.2.aarch64.rpm"
RPM_HASH = "469a0e10a44963b7a22d9ba12b57425b31eadcf2b2a35302146d93c850702a252375a77134aa51a7471c094437a53cd50b422ecfc30c1331a2647de14fd5706c"

RPROVIDES:${PN} += "config(nvidia-open-driver-G06-signed-kmp-default) kmod(nvidia.ko) kmod(nvidia_drm.ko) kmod(nvidia_modeset.ko) kmod(nvidia_peermem.ko) kmod(nvidia_uvm.ko) multiversion(kernel) nvidia-open-driver-G06-signed-kmp nvidia-open-driver-G06-signed-kmp-default nvidia-open-driver-G06-signed-kmp-default(aarch-64) nvidia-open-driver-G06-signed-kmp-default-k6.3.1_1"
RDEPENDS:${PN} += "/bin/sh coreutils grep group(video) kernel-firmware-nvidia-gsp-G06 kernel-uname-r perl-Bootloader suse-kernel-rpm-scriptlets"

inherit rpm
