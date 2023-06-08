SUMMARY = "Development headers the Access Broker & Resource Manager for TPM 2.0 chips"
DESCRIPTION = "This package provides the development files for the Access Broker & Resource \
Manager for coordinating access to TPM 2.0 chips."
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "tpm2.0-abrmd-devel-3.0.0-1.4.aarch64.rpm"
RPM_HASH = "87fbbadad9dc08ca3265b25e243c6e3bed183ed8db9114ea14ce2e71485e1f0af51d226b0635e45880e120c6ae9d6087b76d52a8b64173361da0c567a54c09d3"

RPROVIDES:${PN} += "pkgconfig(tss2-tcti-tabrmd) tpm2.0-abrmd-devel tpm2.0-abrmd-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel libtss2-tcti-tabrmd0 pkgconfig(gio-2.0) pkgconfig(glib-2.0) pkgconfig(tss2-mu) pkgconfig(tss2-sys) tpm2.0-abrmd"

inherit rpm
