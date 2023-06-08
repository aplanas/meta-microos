SUMMARY = "Documentation for texlive-fragmaster"
DESCRIPTION = "This package includes the documentation for texlive-fragmaster"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.6svn26313"

RPM_NAME = "texlive-fragmaster-doc-2023.201.1.6svn26313-52.1.noarch.rpm"
RPM_HASH = "f5677ff3b54757bad9e782de0fa82c853d540decd92327f0c84a9240a8852737063695f7274eb1f0004703a5cfea8d9190075c87d8dbbbbcd64dd8d156bc6733"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-fragmaster-doc:en;de) texlive-fragmaster-doc"
RDEPENDS:${PN} += ""

inherit rpm
