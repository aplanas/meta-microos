SUMMARY = "Manualpages for Pluggable Authentication Modules"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool that \
allows system administrators to set authentication policies without \
having to recompile programs that do authentication. \
 \
This package contains the manual pages."
LICENSE = "GPL-2.0-or-later | BSD-3-Clause"

PV = "1.5.2.90"

RPM_NAME = "pam-manpages-1.5.2.90-1.1.noarch.rpm"
RPM_HASH = "540a5255294f95d1cb6dd76f1c90a592f43f3dacb54225185f8f2404cffaa4625b4ca7c9d05221a5ebace13ea23b7aeaef22d7fcace6ea4abe7290fa5113c603"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pam-manpages pam://usr/share/man/man8/PAM.8.gz"
RDEPENDS:${PN} += ""

inherit rpm
