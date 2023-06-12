SUMMARY = "Development headers the Access Broker & Resource Manager for TPM 2.0 chips"
DESCRIPTION = "This package provides the development files for the Access Broker & Resource \
Manager for coordinating access to TPM 2.0 chips."
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "tpm2.0-abrmd-devel-3.0.0-2.1.aarch64.rpm"
RPM_HASH = "cb41df73359e93f716fa43e2aeddfe3c378a0ef79ef8ebec5998a8fea2f54fd567230d881e708901726018b6ffecb2f52fef74459de962e84ac2ba89e5581410"

RPROVIDES:${PN} += "pkgconfig(tss2-tcti-tabrmd) tpm2.0-abrmd-devel tpm2.0-abrmd-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel libtss2-tcti-tabrmd0 pkgconfig(gio-2.0) pkgconfig(glib-2.0) pkgconfig(tss2-mu) pkgconfig(tss2-sys) tpm2.0-abrmd"

inherit rpm
