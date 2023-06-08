SUMMARY = "KDE Frameworks and Plasma Development"
DESCRIPTION = "KDE Frameworks development packages."
LICENSE = "MIT"

PV = "20230403"

RPM_NAME = "patterns-kde-devel_kde_frameworks-20230403-1.1.noarch.rpm"
RPM_HASH = "9020ef1a53d7d09aca8b16bfea7d08f457b915ed538d1e6caa7c205153bd2b6f6b928e3a806bf3c559c916d1da41fd1f1fce32dc2fa673971503a71c38d8a2f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-kde-devel_kde patterns-kde-devel_kde_frameworks patterns-openSUSE-devel_kde patterns-openSUSE-devel_kde_framework"
RDEPENDS:${PN} += "pattern()"

inherit rpm
