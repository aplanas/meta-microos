SUMMARY = "Plymouth 'script' plugin"
DESCRIPTION = "This package contains the 'script' boot splash plugin for \
Plymouth. It features an extensible, scriptable boot splash \
language that simplifies the process of designing custom \
boot splash themes."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-script-22.02.122+94.4bd41a3-4.1.aarch64.rpm"
RPM_HASH = "4cadc7fa08384419d93100bd079d40a7572cb21fb7ad72aaf5e7c37073b92b40233d72004c32a5fc40c3539b234d326a6e303ae59b466f1a763d423898662e83"

RPROVIDES:${PN} += "plymouth-plugin-script plymouth-plugin-script(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libply-splash-core.so.5()(64bit) libply-splash-core5 libply-splash-graphics.so.5()(64bit) libply-splash-graphics5 libply.so.5()(64bit) libply5"

inherit rpm
