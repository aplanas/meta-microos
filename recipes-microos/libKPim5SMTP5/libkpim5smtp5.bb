SUMMARY = "Job-based library to send email through an SMTP server"
DESCRIPTION = "KSMTP is a job based library to send email through an SMTP server. This \
package contains the KSMTP library itself."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libKPim5SMTP5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "0c47301ac9754a4e71a9a07ec3bf396208a4e11e0d907e0bf1143d12d6a651d58550db72d340c061d680312993338601b6f91bb24e24ff0fc8f2ee65a933c657"

RPROVIDES:${PN} += "libKPim5SMTP.so.5()(64bit) libKPim5SMTP5 libKPim5SMTP5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libsasl2.so.3()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
