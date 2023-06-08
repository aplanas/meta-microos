SUMMARY = "Development files for sleuthkit"
DESCRIPTION = "The sleuthkit-devel package contains libraries and header files for \
developing applications that use sleuthkit."
LICENSE = "CPL-1.0 & IPL-1.0 & GPL-2.0-or-later"

PV = "4.12.0"

RPM_NAME = "sleuthkit-devel-4.12.0-1.3.aarch64.rpm"
RPM_HASH = "1297827293e85d8f9c74e0808ccd806148cb5084f08a8879afab0353d5e102972b3fa297b1cfc875c49a5a77ad6119dce2d9937b61c8f56563a68b1b07bd691b"

RPROVIDES:${PN} += "pkgconfig(tsk) sleuthkit-devel sleuthkit-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libtsk19 pkgconfig(libewf) pkgconfig(zlib)"

inherit rpm
