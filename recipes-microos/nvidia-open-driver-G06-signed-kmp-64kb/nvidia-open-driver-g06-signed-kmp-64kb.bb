SUMMARY = "NVIDIA open kernel module driver for GeForce RTX 2000 series and newer"
DESCRIPTION = "This package provides the open-source NVIDIA kernel module driver \
for GeForce RTX 2000 series and newer GPUs."
LICENSE = "GPL-2.0-only & MIT"

PV = "525.116.04_k6.3.4_1"

RPM_NAME = "nvidia-open-driver-G06-signed-kmp-64kb-525.116.04_k6.3.4_1-1.4.aarch64.rpm"
RPM_HASH = "ce214eaf138692959dde5d811ef69ad97a59bf9614dc8c7dfb77e2ac17a86fbe38b7dd5d86f83db40ab47b96ece61a14b2ac0aadaf87f511c1c7d251b1690d6b"

RPROVIDES:${PN} += "config(nvidia-open-driver-G06-signed-kmp-64kb) \
kmod(nvidia.ko) \
kmod(nvidia_drm.ko) \
kmod(nvidia_modeset.ko) \
kmod(nvidia_peermem.ko) \
kmod(nvidia_uvm.ko) \
multiversion(kernel) \
nvidia-open-driver-G06-signed-kmp \
nvidia-open-driver-G06-signed-kmp-64kb \
nvidia-open-driver-G06-signed-kmp-64kb(aarch-64) \
nvidia-open-driver-G06-signed-kmp-64kb-k6.3.4_1"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
grep \
group(video) \
kernel-firmware-nvidia-gsp-G06 \
kernel-uname-r \
perl-Bootloader \
suse-kernel-rpm-scriptlets"

inherit rpm
