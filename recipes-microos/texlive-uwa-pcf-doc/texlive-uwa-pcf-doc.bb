SUMMARY = "Documentation for texlive-uwa-pcf"
DESCRIPTION = "This package includes the documentation for texlive-uwa-pcf"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn64491"

RPM_NAME = "texlive-uwa-pcf-doc-2023.201.1.0.1svn64491-53.1.noarch.rpm"
RPM_HASH = "0f16adb9636edc9e1ffde5b9570bc7f1d67e54bd3dfa3dea1652a0aaef76477f2778816c3f385805733c93755591d193ea6fe30a396509b0cbf499e49978ac1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uwa-pcf-doc"
RDEPENDS:${PN} += ""

inherit rpm
