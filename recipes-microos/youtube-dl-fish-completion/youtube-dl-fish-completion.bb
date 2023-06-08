SUMMARY = "Fish completion for youtube-dl"
DESCRIPTION = "Fish command line completion support for youtube-dl."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2021.12.17"

RPM_NAME = "youtube-dl-fish-completion-2021.12.17-6.1.noarch.rpm"
RPM_HASH = "b2aae95ed690223271873ef648dd1534f8cf3d498b811cb4de0e033e6c9c26bf212095fd39dfcd5e4c4f0b2076695e22f8aec3b2890536c202a5a932e85fbc3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "youtube-dl-fish-completion"
RDEPENDS:${PN} += "fish"

inherit rpm
