SUMMARY = "LIRC core, always needed to run LIRC"
DESCRIPTION = "The LIRC core contains the lircd daemons, the devinput and \
default driver and most of the applications."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "lirc-core-0.10.1-9.3.aarch64.rpm"
RPM_HASH = "3448dfea1dd06bb0cdb41b9376123e3a96473468a1938f79ee59f1bfe693f05b9248d1cceb56cf6d6031b4d720c29c9a183e4cdb849b0370e672afe68a4c2cfd"

RPROVIDES:${PN} += "config(lirc-core) lirc lirc-core lirc-core(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/bash /usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libirrecord.so.0()(64bit) liblirc.so.0()(64bit) liblirc_client.so.0()(64bit) liblirc_driver.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) python(abi) shadow systemd typelib(GLib) typelib(GObject) typelib(Gtk) typelib(Vte)"

inherit rpm
