SUMMARY = "Bash completion for yt-dlp"
DESCRIPTION = "Bash command line completion support for yt-dlp."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2023.03.04"

RPM_NAME = "yt-dlp-bash-completion-2023.03.04-2.1.noarch.rpm"
RPM_HASH = "41b4af5fb11aa55004999908777e0799a13b8f9a0eec9adb4ef5812c89c00818780a04cdd8c1885344372cd90f564a5ba4de1568362a56243042a3105463f978"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yt-dlp-bash-completion"
RDEPENDS:${PN} += "bash-completion"

inherit rpm
