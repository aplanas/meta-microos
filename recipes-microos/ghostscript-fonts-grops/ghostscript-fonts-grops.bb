SUMMARY = "Ghostscript fonts imported to groff for use with grops"
DESCRIPTION = "A version of PostScript® driver for Groff to support characters outside ISO Latin 1 character set."
LICENSE = "GPL-2.0-only"

PV = "1.22.2"

RPM_NAME = "ghostscript-fonts-grops-1.22.2-10.8.noarch.rpm"
RPM_HASH = "5ee9aa110e0355aef630bb25b63330dcd67d258ac339c2bd8f816c897c8252ef059952a9e484b1ea768f65c060245086da5488d365d0e50285b441a60a39351a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(ghostscript-fonts-grops) ghostscript-fonts-grops locale(groff:pl)"
RDEPENDS:${PN} += "groff"

inherit rpm
