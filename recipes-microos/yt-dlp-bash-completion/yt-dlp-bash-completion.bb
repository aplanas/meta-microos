SUMMARY = "Bash completion for yt-dlp"
DESCRIPTION = "Bash command line completion support for yt-dlp."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2023.03.04"

RPM_NAME = "yt-dlp-bash-completion-2023.03.04-1.1.noarch.rpm"
RPM_HASH = "1e25aad139a00dbfcaf7da37fba762b5b21843258b415b2d937671c7f891317a3ded89c1a645bc1e4e74b28d2d2d873901a066f0eeffef4d7dfbef80568a0f8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yt-dlp-bash-completion"
RDEPENDS:${PN} += "bash-completion"

inherit rpm
