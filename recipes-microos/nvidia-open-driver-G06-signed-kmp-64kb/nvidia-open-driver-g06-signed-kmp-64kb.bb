SUMMARY = "NVIDIA open kernel module driver for GeForce RTX 2000 series and newer"
DESCRIPTION = "This package provides the open-source NVIDIA kernel module driver \
for GeForce RTX 2000 series and newer GPUs."
LICENSE = "GPL-2.0-only & MIT"

PV = "525.116.03_k6.3.1_1"

RPM_NAME = "nvidia-open-driver-G06-signed-kmp-64kb-525.116.03_k6.3.1_1-1.2.aarch64.rpm"
RPM_HASH = "e13989e89406787e4e704fab0be1bfd49eaf36c3009dd9f4b37454e1bdfc2af9b8e8ac5b135632e251ff96baed9f211a6ee15ba6961e3bb642dd2df9f195216b"

RPROVIDES:${PN} += "config(nvidia-open-driver-G06-signed-kmp-64kb) kmod(nvidia.ko) kmod(nvidia_drm.ko) kmod(nvidia_modeset.ko) kmod(nvidia_peermem.ko) kmod(nvidia_uvm.ko) multiversion(kernel) nvidia-open-driver-G06-signed-kmp nvidia-open-driver-G06-signed-kmp-64kb nvidia-open-driver-G06-signed-kmp-64kb(aarch-64) nvidia-open-driver-G06-signed-kmp-64kb-k6.3.1_1"
RDEPENDS:${PN} += "/bin/sh coreutils grep group(video) kernel-firmware-nvidia-gsp-G06 kernel-uname-r perl-Bootloader suse-kernel-rpm-scriptlets"

inherit rpm
