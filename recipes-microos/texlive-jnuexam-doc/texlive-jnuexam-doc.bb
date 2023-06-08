SUMMARY = "Documentation for texlive-jnuexam"
DESCRIPTION = "This package includes the documentation for texlive-jnuexam"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn56867"

RPM_NAME = "texlive-jnuexam-doc-2023.201.1.0svn56867-55.1.noarch.rpm"
RPM_HASH = "13295060956750f5708b9256be0e63218efc111f56fe26578fc93ef7846022f5470e43c974bae3a79a9f3f6dd04c2a2bed2d44471d24fe7cc80f9a9f87a7f119"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-jnuexam-doc:zh) texlive-jnuexam-doc"
RDEPENDS:${PN} += ""

inherit rpm
