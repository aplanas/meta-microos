SUMMARY = "Documentation for the LilyPond Typesetter"
DESCRIPTION = "Common and english documentation files for the \
GNU LilyPond music typesetter."
LICENSE = "GFDL-1.3-only"

PV = "2.24.1"

RPM_NAME = "lilypond-doc-2.24.1-2.3.noarch.rpm"
RPM_HASH = "88b7e28180f14d1470b0d077bec7ca4f3832a839baebcf87324dda5d469504362ed90c365a58ff8075de39749d16da4729a2557250c7880340ee29e3f3db1d64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-doc lilypond-documentation"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
