SUMMARY = "Development files for libsubtitleeditor"
DESCRIPTION = "The libsubtitleeditor-devel package contains libraries and header files for \
developing applications that use libsubtitleeditor0."
LICENSE = "GPL-3.0"

PV = "0.54.0"

RPM_NAME = "libsubtitleeditor-devel-0.54.0-4.16.aarch64.rpm"
RPM_HASH = "254b4deb064140922045f85420b9adf6ae3e21e3704d41e74cabc9d16fe3f14090ee05333823d24dc50d8b0e19bcdf4d20b1d69a718c43cdf1f990f30a032273"

RPROVIDES:${PN} += "libsubtitleeditor-devel libsubtitleeditor-devel(aarch-64)"
RDEPENDS:${PN} += "libsubtitleeditor0"

inherit rpm
