SUMMARY = "Development files for libcom_err, static libraries"
DESCRIPTION = "Development files for the com_err error message display library. Static libraries."
LICENSE = "MIT"

PV = "1.47.0"

RPM_NAME = "libcom_err-devel-static-1.47.0-1.1.aarch64.rpm"
RPM_HASH = "6a2d90c333dd9ef8958dfb1ab597d79037bcbe15dc268c29ebd4e6265911d90f20a4d47229a7e88a8164c24d0a0695559cf1d716e49ca0b9a5589966d9ad9bc0"

RPROVIDES:${PN} += "libcom_err-devel-static \
libcom_err-devel-static(aarch-64) \
libcom_err-devel:/usr/lib64/libcom_err.a \
libcom_err-devel:/usr/lib64/libss.a"
RDEPENDS:${PN} += "libcom_err-devel"

inherit rpm
