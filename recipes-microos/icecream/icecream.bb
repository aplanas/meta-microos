SUMMARY = "Distributed Compilation in the Network"
DESCRIPTION = "Distributed compiler with a central scheduler to share build load."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.0"

RPM_NAME = "icecream-1.4.0-2.5.aarch64.rpm"
RPM_HASH = "cc134ecefd821d22a9b770421a806d70322af2374de4dd260d495998ffc42a6f4fc6ebd8eb0040f280e7757fd1ad1b4476fb6a691b188b3a9d9d7c6fcbe5d2da"

RPROVIDES:${PN} += "config(icecream) icecream icecream(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /bin/tar /usr/bin/bzip2 /usr/bin/mkdir /usr/bin/touch /usr/sbin/groupadd /usr/sbin/useradd fillup ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libarchive.so.13()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcap-ng.so.0()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) liblzo2.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libzstd.so.1()(64bit) logrotate systemd"

inherit rpm
