SUMMARY = "Computer monitoring and classroom management"
DESCRIPTION = "Veyon is a software for computer monitoring and classroom \
management supporting Windows and Linux. It enables teachers to view and \
control computer labs and interact with students. Veyon is available in \
different languages. The user can: \
 \
* see what's going on in computer labs in overview mode and take screenshots \
* remote control computers to support and help users \
* broadcast the teacher's screen to students in realtime by using demo mode \
  (either in fullscreen or in a window) \
* lock workstations for attracting attention to teacher \
* send text messages to students \
* power on/off and rebooting computers remote \
* remote logoff and remote execute arbitrary commands/scripts \
* do home schooling"
LICENSE = "GPL-2.0-or-later"

PV = "4.7.5"

RPM_NAME = "veyon-4.7.5-1.3.aarch64.rpm"
RPM_HASH = "43d9b01546378c15a9fc3c55ad0bd7be3ac9e151450a54a2ae0a76643eea12c0d7aa85a42d21c4ec573ac4ee50185c02218778581b83da64e6feff1a44499756"

RPROVIDES:${PN} += "application() application(veyon-configurator.desktop) application(veyon-master.desktop) libkldap-light.so()(64bit) libldap-common.so()(64bit) libveyon-core.so()(64bit) veyon veyon(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkexec ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.4)(64bit) libQt6DBus.so.6()(64bit) libQt6DBus.so.6(Qt_6)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libX11.so.6()(64bit) libXcomposite.so.1()(64bit) libXdamage.so.1()(64bit) libXext.so.6()(64bit) libXfixes.so.3()(64bit) libXi.so.6()(64bit) libXinerama.so.1()(64bit) libXrandr.so.2()(64bit) libXtst.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libfakekey.so.0()(64bit) liblber.so.2()(64bit) liblber.so.2(OPENLDAP_2.200)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libprocps.so.8()(64bit) libprocps.so.8(LIBPROCPS_0)(64bit) libqca-qt6.so.2()(64bit) libsasl2.so.3()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libvncclient.so.1()(64bit) libvncserver.so.1()(64bit) permissions systemd"

inherit rpm
