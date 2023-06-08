SUMMARY = "Documentation for the LilyPond Typesetter (it)"
DESCRIPTION = "Italian documentation files for the GNU LilyPond music typesetter."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.1"

RPM_NAME = "lilypond-doc-it-2.24.1-2.3.noarch.rpm"
RPM_HASH = "252180b42ed9e7f9f6f5b3753c498d230e9be8554273f6f4d72700a62b565670a675cdc9c36551d9a0bc91f96d2c1d2af28d23f8a2e749a9b1b2578d259e80ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc-it"
RDEPENDS:${PN} += "lilypond-doc"

inherit rpm
