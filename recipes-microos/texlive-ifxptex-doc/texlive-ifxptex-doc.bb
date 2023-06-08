SUMMARY = "Documentation for texlive-ifxptex"
DESCRIPTION = "This package includes the documentation for texlive-ifxptex"
LICENSE = "SUSE-TeX"

PV = "2023.201.0.0.2svn46153"

RPM_NAME = "texlive-ifxptex-doc-2023.201.0.0.2svn46153-52.1.noarch.rpm"
RPM_HASH = "3abd026e310a5b8a1e22ae2411cfec605860b49432108ce4ffa9dd4c06a1ac250fceb01c4cb95bf10cddddd4ce4e8f84b096529fc1e069be196ffdd50671d41d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ifxptex-doc"
RDEPENDS:${PN} += ""

inherit rpm
