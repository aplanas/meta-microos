SUMMARY = "PipeWire media server ALSA support"
DESCRIPTION = "This package contains an ALSA plugin for the PipeWire media server."
LICENSE = "MIT"

PV = "0.3.69"

RPM_NAME = "pipewire-alsa-0.3.69-2.1.aarch64.rpm"
RPM_HASH = "a633f7b755b7ce88638e2a7532a8624eb583ea237e7c8ed911a3c093ee35e534aa9150b3e0d5ccec36d476b4573392ea232dd25603057a3002413be5e9fd90bb"

RPROVIDES:${PN} += "config(pipewire-alsa) libasound_module_ctl_pipewire.so()(64bit) libasound_module_pcm_pipewire.so()(64bit) pipewire-alsa pipewire-alsa(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libpipewire-0.3.so.0()(64bit) libpipewire-0_3-0"

inherit rpm
