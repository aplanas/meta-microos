SUMMARY = "Documentation for google-worksans-fonts"
DESCRIPTION = "This package contains the documentation of google-worksans-fonts."
LICENSE = "OFL-1.1"

PV = "2.010"

RPM_NAME = "google-worksans-fonts-doc-2.010-1.7.noarch.rpm"
RPM_HASH = "ce471e965b904f4fa60e89533a499cbf649b403966bbec855dc49fd57009ce82f08c537508807a6144d2d88bcc140832add8f3f174355092841aa1ba25233e15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-worksans-fonts-doc"
RDEPENDS:${PN} += ""

inherit rpm
