SUMMARY = "Include Files and Libraries for PAM Development"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool which \
allows system administrators to set authentication policy without \
having to recompile programs which do authentication. \
 \
This package contains header files and static libraries used for \
building both PAM-aware applications and modules for use with PAM."
LICENSE = "GPL-2.0-or-later | BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "pam-devel-1.5.3-1.1.aarch64.rpm"
RPM_HASH = "69c3d4f7c7c3419ee4fa57aee1dc6936539a585fa6bebc3262819177f07e5c0db9ddca562ba17b55e3d35d2a1c58bb55c690332882d1d7da2765df67f0f6c102"

RPROVIDES:${PN} += "pam-devel pam-devel(aarch-64) pkgconfig(pam) pkgconfig(pam_misc) pkgconfig(pamc) rpm_macro(_pam_confdir) rpm_macro(_pam_libdir) rpm_macro(_pam_moduledir) rpm_macro(_pam_secconfdir) rpm_macro(_pam_secdistconfdir) rpm_macro(_pam_vendordir) rpm_macro(_pamdir)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel pam"

inherit rpm
