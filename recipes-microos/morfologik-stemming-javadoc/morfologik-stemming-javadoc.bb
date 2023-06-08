SUMMARY = "Javadoc for morfologik-stemming"
DESCRIPTION = "This package contains javadoc for morfologik-stemming."
LICENSE = "BSD-3-Clause"

PV = "2.1.9"

RPM_NAME = "morfologik-stemming-javadoc-2.1.9-1.1.noarch.rpm"
RPM_HASH = "95ea05ea0f664a62277f8f874ebc359a07d162fa42c47007cbf194e91128a3203e0e870fde0170c7692a245fe616fa394e9c6e5d00c037f7825fa4e513985cde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "morfologik-stemming-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
