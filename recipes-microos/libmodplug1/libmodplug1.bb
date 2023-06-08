SUMMARY = "Shared library part of libmodplug"
DESCRIPTION = "Modplug library based on the ModPlug sound engine. \
- plays 22 different mod formats. \
- plays zip, rar, gzip, and bzip2 compressed mods. \
- plays timidity's GUS patch files (*.pat). \
- plays all types of MIDI files (*.mid). \
- plays textfiles written in the ABC music notation (*.abc)."
LICENSE = "SUSE-Public-Domain"

PV = "0.8.9.0+git20170610.f6dd59a"

RPM_NAME = "libmodplug1-0.8.9.0+git20170610.f6dd59a-2.8.aarch64.rpm"
RPM_HASH = "e4cbf8664db68b09ca13aacf4992f4dadd83fd7a1c690d2450facd030599d65224e82baa079b25b0f2b5af57a6199aa54f54dc25f0548c3dffd8b615f5e49368"

RPROVIDES:${PN} += "libmodplug.so.1()(64bit) libmodplug1 libmodplug1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
