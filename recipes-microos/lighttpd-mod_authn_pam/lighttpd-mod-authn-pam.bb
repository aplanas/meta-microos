SUMMARY = "PAM authentication in lighttpd"
DESCRIPTION = "A module to provide PAM authentication in lighttpd."
LICENSE = "BSD-3-Clause"

PV = "1.4.69"

RPM_NAME = "lighttpd-mod_authn_pam-1.4.69-1.3.aarch64.rpm"
RPM_HASH = "99e52f7cb29d7138ef9d66c75f604aaabe6c4471207d88f3689f8a06bb5b6a5a160ccb793af81bf236850adf983cdcf052910cbbe523802b392044e85517d520"

RPROVIDES:${PN} += "lighttpd-mod_authn_pam lighttpd-mod_authn_pam(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) lighttpd"

inherit rpm
