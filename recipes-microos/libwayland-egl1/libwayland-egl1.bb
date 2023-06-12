SUMMARY = "Additional egl functions for wayland"
DESCRIPTION = "This package provides additional functions for EGL-using programs \
that run within the Wayland framework. This allows for applications \
that need not run full-screen and cooperate with a compositor."
LICENSE = "MIT"

PV = "1.22.0"

RPM_NAME = "libwayland-egl1-1.22.0-1.1.aarch64.rpm"
RPM_HASH = "e3f465345bf01aa7d31233b19d2f9902ab1ffba7357ce393994c297d24b191b20da3e48a45790af819617dffd0f20918f6f88048cbb0df9948e81cc48bda4286"

RPROVIDES:${PN} += "libwayland-egl.so.1()(64bit) \
libwayland-egl1 \
libwayland-egl1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
