SUMMARY = "Documentation for texlive-mpfonts"
DESCRIPTION = "This package includes the documentation for texlive-mpfonts"
LICENSE = "SUSE-TeX"

PV = "2023.201.svn54512"

RPM_NAME = "texlive-mpfonts-doc-2023.201.svn54512-54.1.noarch.rpm"
RPM_HASH = "372d0777fe79165da6a64883bdd8e5b6e72ce8ed3b66412ba47dd50ae00401ccdd6560fef3855a1c7cb96f7cb04eca229d9e7c71958f60c65db7c4adf65adb05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mpfonts-doc"
RDEPENDS:${PN} += ""

inherit rpm
