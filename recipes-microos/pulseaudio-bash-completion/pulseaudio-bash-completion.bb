SUMMARY = "PulseAudio Bash completion"
DESCRIPTION = "Optional dependency offering bash completion for various PulseAudio utilities"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "16.1"

RPM_NAME = "pulseaudio-bash-completion-16.1-3.1.aarch64.rpm"
RPM_HASH = "00cbc32306acf98e086691e25e64e034e9634fadb91a86ccf8c4fa22d8d96440404ad2e7147485d4bbc5788f7cbc2e380ef8942701708a2b281b38e2fd3c0e27"

RPROVIDES:${PN} += "pulseaudio-bash-completion pulseaudio-bash-completion(aarch-64)"
RDEPENDS:${PN} += "bash-completion pulseaudio-utils"

inherit rpm
