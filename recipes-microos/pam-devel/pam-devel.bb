SUMMARY = "Include Files and Libraries for PAM Development"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool which \
allows system administrators to set authentication policy without \
having to recompile programs which do authentication. \
 \
This package contains header files and static libraries used for \
building both PAM-aware applications and modules for use with PAM."
LICENSE = "GPL-2.0-or-later | BSD-3-Clause"

PV = "1.5.2.90"

RPM_NAME = "pam-devel-1.5.2.90-1.1.aarch64.rpm"
RPM_HASH = "5d03643dda08ca9076eb748bade99c23ae309ee9184963974d465b9f20508c9ba2a45a87f386872f801ff1358eff7d894389c557863503748da6fa48d5f044fe"

RPROVIDES:${PN} += "pam-devel pam-devel(aarch-64) pkgconfig(pam) pkgconfig(pam_misc) pkgconfig(pamc) rpm_macro(_pam_confdir) rpm_macro(_pam_libdir) rpm_macro(_pam_moduledir) rpm_macro(_pam_secconfdir) rpm_macro(_pam_secdistconfdir) rpm_macro(_pam_vendordir) rpm_macro(_pamdir)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel pam"

inherit rpm
