SUMMARY = "Samba Documentation"
DESCRIPTION = "This package contains all the Samba documentation as it is not part of \
the man pages."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1+git.298.4ccf830b2a4"

RPM_NAME = "samba-doc-4.18.1+git.298.4ccf830b2a4-1.1.noarch.rpm"
RPM_HASH = "8bd1036449cccadbbbd288c6437b753a4de5ad3d576035b8f6bc1f20752eec8cb164749a715cdc441f62251012f5be1c3fce9a241c904b9ebc1570b80a0b7fe6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "samba-doc"
RDEPENDS:${PN} += "coreutils findutils"

inherit rpm
