SUMMARY = "Documentation for texlive-lettrine"
DESCRIPTION = "This package includes the documentation for texlive-lettrine"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.30svn64511"

RPM_NAME = "texlive-lettrine-doc-2023.201.2.30svn64511-54.1.noarch.rpm"
RPM_HASH = "cafbbc9a430372c87a63abdab1a371fea64e88e2ed0cc7be49e9126465d193f54612c9102cc5084042f99225ddffe1e19e7d184d68632a73d1fd7b231815508b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-lettrine-doc:de;fr) texlive-lettrine-doc"
RDEPENDS:${PN} += ""

inherit rpm
