SUMMARY = "Development files for the SSSD D-Bus responder helper library"
DESCRIPTION = "This subpackage provides the development files for sssd's simpleifp, \
a library that simplifies the D-Bus API for the SSSD InfoPipe \
responder."
LICENSE = "GPL-3.0-or-later"

PV = "2.8.2"

RPM_NAME = "libsss_simpleifp-devel-2.8.2-4.3.aarch64.rpm"
RPM_HASH = "e7fa8d03c42775401fcefe4fb6bee7b817ada642368764d6454087613d62e88675d44ac9ec56dcb9c6bd9c147fdb229140050876eb240e08bdfb25e364e06535"

RPROVIDES:${PN} += "libsss_simpleifp-devel libsss_simpleifp-devel(aarch-64) pkgconfig(sss_simpleifp)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libsss_simpleifp0 pkgconfig(dbus-1) pkgconfig(dhash)"

inherit rpm
