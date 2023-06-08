SUMMARY = "Binary files of mf2pt1"
DESCRIPTION = "Binary files of mf2pt1"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn23406"

RPM_NAME = "texlive-mf2pt1-bin-2023.20230311.svn23406-89.1.aarch64.rpm"
RPM_HASH = "0584c4e7f366477d532423f9f9ccdc2e44ec476ced8954535e82bdf816e72750c869065f1a47c1f012ecba5b06ffa1f0ea1d584c8318e737dcd8c6431c209cdb"

RPROVIDES:${PN} += "texlive-mf2pt1-bin texlive-mf2pt1-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-mf2pt1"

inherit rpm
