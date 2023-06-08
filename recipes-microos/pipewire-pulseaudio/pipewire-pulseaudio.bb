SUMMARY = "PipeWire PulseAudio implementation"
DESCRIPTION = "This package provides a PulseAudio implementation based on PipeWire"
LICENSE = "MIT"

PV = "0.3.69"

RPM_NAME = "pipewire-pulseaudio-0.3.69-2.1.aarch64.rpm"
RPM_HASH = "d145a13e18050d6f6a0b73d5277aafbce34bcddb30b93cf7a34dad430db36136f09648a95ec6b62905ad528b47ef64d54f4b0894ba9a19d62141f2bd7b2d24ff"

RPROVIDES:${PN} += "pipewire-pulseaudio pipewire-pulseaudio(aarch-64) pulseaudio-daemon"
RDEPENDS:${PN} += "/bin/sh libpipewire-0_3-0 pipewire pulseaudio-setup pulseaudio-utils"

inherit rpm
