SUMMARY = "Fish completion for yt-dlp"
DESCRIPTION = "Fish command line completion support for yt-dlp."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2023.03.04"

RPM_NAME = "yt-dlp-fish-completion-2023.03.04-1.1.noarch.rpm"
RPM_HASH = "d86ff32d532aa72d3987e5f7b1e8e4c68b54497aff5f972f4db9ec39c9652fd13d47011df540c905dca6930896a0f5166d5d6dbe0f1f29ae718a1df270cb8450"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yt-dlp-fish-completion"
RDEPENDS:${PN} += "fish"

inherit rpm
