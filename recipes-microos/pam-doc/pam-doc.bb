SUMMARY = "Documentation for Pluggable Authentication Modules"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool that \
allows system administrators to set authentication policies without \
having to recompile programs that do authentication. \
 \
This package contains the documentation."
LICENSE = "GPL-2.0-or-later | BSD-3-Clause"

PV = "1.5.2.90"

RPM_NAME = "pam-doc-1.5.2.90-1.1.noarch.rpm"
RPM_HASH = "c4ca819f5b808bda11cb1230c938a3c88aca1e9d6499f9aec927d85b1d2af4e0a522dbe53afb3292dcf74e80b553fadbc03ad1a1358079a18c52e116b925ba6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pam-doc"
RDEPENDS:${PN} += ""

inherit rpm
