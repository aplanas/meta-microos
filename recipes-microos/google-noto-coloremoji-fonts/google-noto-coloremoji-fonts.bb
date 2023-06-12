SUMMARY = "Noto Color Emoji font"
DESCRIPTION = "Noto Color Emoji font"
LICENSE = "OFL-1.1"

PV = "20230315"

RPM_NAME = "google-noto-coloremoji-fonts-20230315-1.1.noarch.rpm"
RPM_HASH = "49d70826bf2a65e79b511a3955daffe3b222344bb88ed646869817147dfafdcde423eb0144acf73929063284502bcbffb31cde8a1fa398130f8e26e36457a4f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-coloremoji-fonts \
noto-coloremoji-fonts \
noto-emoji-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
