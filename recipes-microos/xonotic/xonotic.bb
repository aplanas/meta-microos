SUMMARY = "Fast-paced first person shooter"
DESCRIPTION = "Fast-paced first-person shooter that works on Windows, OS X and Linux. The project is geared towards providing addictive arena shooter gameplay which is all spawned and driven by the community itself. Being a direct successor of the Nexuiz project with years of development between them, and it aims to become the best possible open-source FPS (first-person-shooter) of its kind."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.5"

RPM_NAME = "xonotic-0.8.5-1.5.aarch64.rpm"
RPM_HASH = "654852d48eec6674c9a11f6cf5d05828dc72c31cc992dca8c6e2ec2f6def7be570028f3ffb123088e9847fd7c646d15d4c9faa5deccf3215ca3530814359994c"

RPROVIDES:${PN} += "application() application(xonotic.desktop) metainfo() metainfo(xonotic.appdata.xml) xonotic xonotic(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSDL2-2.0.so.0()(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libXpm.so.4()(64bit) libXxf86vm.so.1()(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libc.so.6(GLIBC_2.34)(64bit) libd0_blind_id.so.0()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libz.so.1()(64bit) logrotate xonotic-data"

inherit rpm
