SUMMARY = "Documentation for texlive-fancyvrb"
DESCRIPTION = "This package includes the documentation for texlive-fancyvrb"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.5asvn65585"

RPM_NAME = "texlive-fancyvrb-doc-2023.201.4.5asvn65585-52.1.noarch.rpm"
RPM_HASH = "028443b41b3c113165824249ebda1956630992cba11823015989eb1b2a1433e7992470f6fc4e0e8eba945db580e6b02268fb0ed9a99b932373ab24fd213df11a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancyvrb-doc"
RDEPENDS:${PN} += ""

inherit rpm
