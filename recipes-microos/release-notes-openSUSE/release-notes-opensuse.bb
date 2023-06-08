SUMMARY = "Release Notes for openSUSE"
DESCRIPTION = "This package contains the release notes with the most important changes \
for openSUSE Tumbleweed."
LICENSE = "GFDL-1.3"

PV = "84.87.20180228.827b030"

RPM_NAME = "release-notes-openSUSE-84.87.20180228.827b030-1.41.noarch.rpm"
RPM_HASH = "ec3958e1000a18ef63658ad2a62dcaafc59d06e2fa29191ab35438434d70ef16c091fe8b7805b6c8b4f7d2f7b42546cdd909415c1134f4347404b476fc990862"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "release-notes release-notes-openSUSE"
RDEPENDS:${PN} += ""

inherit rpm
